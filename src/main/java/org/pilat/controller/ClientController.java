/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.controller;

import org.pilat.model.Client;
import org.pilat.repository.ClientRepository;
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
public class ClientController {

    @Autowired
    private ClientRepository cr;

    @RequestMapping("/addclient")
    public String addClient() {

        System.out.println("ODPALAM addevent controller!");

        return "addClient";
    }

    @PostMapping("/addclient")
    public String clientForm(Model model,
            @RequestParam("clientFirstName") String clientFirstName,
            @RequestParam("clientLastName") String clientLastName) {
        
        Client c = new Client(clientFirstName, clientLastName);
        
        System.out.println("Zapisuję klienta: " + c.toString());
        
        cr.save(c);
        
        System.out.println("Zapisałem klienta: " + c.toString());

        return "addClient";
    }
}

