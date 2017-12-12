/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.controller;

import org.pilat.model.Adress;
import org.pilat.repository.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired //moze byc do usuniecia
    private AdressRepository ar;

    @RequestMapping("/addadress")
    public String addAdress() {

        System.out.println("ODPALAM AdressController!");

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

        Adress a = new Adress(adress_type, country, voivodeship, city, street_name, street_number, street_flat_number);

        System.out.println("Zapisuję!" + " " + a.toString());

        ar.save(a);

        System.out.println("Zapisałem!" + " " + a.toString());

        return "addAdress";
    }

}
