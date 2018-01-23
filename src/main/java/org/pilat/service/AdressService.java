/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.service;

import java.util.List;
import org.pilat.model.Adress;
/**
 *
 * @author Pilat
 */
public interface AdressService {

    void saveAdress(Adress adress);
    
    Adress findById(long id);

    List<Adress> findByStreet(String streetName);

    void deleteAdressById(Long id);

    List<Adress> findAllAdress();

    void deleteAllAdress();    
}
