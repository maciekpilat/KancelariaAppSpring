/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.controller;

import org.pilat.model.Adress;
import org.pilat.repository.AdressRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Pilat
 */
@Controller
public class AdressController {

    private AdressRepository ar;

    @RequestMapping("/addadress")
    public String addAdress() {

        System.out.println("ODPALAM AdressController!");

//        //System.out.println(ar.findOne(1L)+ "crud find one");
//        
//        Adress ad = new Adress(1L, 1L, 1L, 1L, "Zielona", 1L, 1L);
//        ar.save(ad);
//        System.out.println("Zapisałem!");
        return "addAdress";
    }

    @PostMapping("/addadress")
    public String addAdressForm(Model model,
            @RequestParam("adress_type") Long adress_type,
            @RequestParam("country") Long country,
            @RequestParam("voivodeship") Long voivodeship,
            @RequestParam("city") Long city,
            @RequestParam("street_name") String street_name,
            @RequestParam("street_number") Long street_number,
            @RequestParam("street_flat_number") Long street_flat_number
    ) {
       
        Adress a = new Adress(2L,country, voivodeship, city, street_name, street_number, street_flat_number);
        System.out.println(a.toString());
        
//        Long firstname1 = firstname;
//        Long lastname1 = lastname;
//        Long country1 = country;
//        Long voivodeship1 = voivodeship;
//        Long city1 = city;
//        String street_name1 = street_name;
//        Long street_number1 = street_number;
//        Long street_flat_number1 = street_flat_number;

        //System.out.println(firstname + lastname + country + voivodeship);

       //String value1 = request.getParameter("value1");
        
        return "addAdress";
    }

}
