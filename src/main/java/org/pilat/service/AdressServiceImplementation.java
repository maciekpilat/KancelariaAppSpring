/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.service;

import java.util.ArrayList;
import java.util.List;
import org.pilat.model.Adress;
import org.pilat.repository.AdressRepository;

/**
 *
 * @author Pilat
 */
public class AdressServiceImplementation implements AdressService {

    AdressRepository ar;

    // sprawdzić!!!
    
    @Override
    public void saveAdress(Adress adress) {
        System.out.println("Zapisuję adres: " + adress.toString());
        ar.save(adress);
        System.out.println("Zapisałem adres!");
    }

    @Override
    public Adress findById(long id) {
        System.out.println("Szukam adresu o id = " + id);
        Adress a = ar.findOne(id);

        if (a != null) {
            System.out.println("Znalazłem: " + a.toString());
        } else {
            System.out.println("Nic nie znalazłem!");
        }

        System.out.println("Znalazłem adres " + id);
        return a;
    }

    @Override
    public List<Adress> findByStreet(String streetName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAdressById(Long id) {
        System.out.println("Kasuję adres o id = " + id);
        ar.delete(id);
        System.out.println("Skasowałem!");
    }

    @Override
    public List<Adress> findAllAdress() {

        List<Adress> adressList = new ArrayList<>();
        ar.findAll().forEach(adressList::add);

        for (Adress a : adressList) {
            System.out.println("Adres: " + a.toString());
        }

        return adressList;

    }

    @Override
    public void deleteAllAdress() {
        System.out.println("Kasuję wszystko!");
        ar.deleteAll();
        System.out.println("Skasowałem!");
    }

}
