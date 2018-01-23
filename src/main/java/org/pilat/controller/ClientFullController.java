/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.controller;

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
public class ClientFullController {
    
    
    
    @RequestMapping("/addclientadress")
    public String ClientFull(){
        
        return "addClientAdress";
    }
    
    @PostMapping("/addclientadress")
    public String ClientFullForm(Model model,
            @RequestParam("clientFirstName") String clientFirstName,
            @RequestParam("clientLastName") String clientLastName,
            @RequestParam("adress_type") Long adress_type,
            @RequestParam("country") Long country,
            @RequestParam("voivodeship") Long voivodeship,
            @RequestParam("city") Long city,
            @RequestParam("street_name") String street_name,
            @RequestParam("street_number") Long street_number,
            @RequestParam("street_flat_number") Long street_flat_number
            ){
        
        
        return "addClientAdress";
    }
}
