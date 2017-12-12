/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.controller;

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
//import org.pilat.model.Adress;
//import org.pilat.repository.AdressRepository;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Pilat
 */
//@Controller
//public class ClientController {
//
//
//
//    @RequestMapping("/addclient")
//    public String addClient() {
//
//        System.out.println("ODPALAM ClientController!");
//
//
//        return "addClient";
//    }
//
//}




@Controller
public class ClientController {

   // private ClientRepository cr;

    @RequestMapping("/addclient")
    public String addClient() {

        System.out.println("ODPALAM addevent controller!");

        return "addClient";
    }

    
}
