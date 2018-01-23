/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.controller;

import org.pilat.model.EventType;
import org.pilat.repository.EventTypeRepository;
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
public class EventTypeController {
    
    @Autowired
    private EventTypeRepository er;

    @RequestMapping("/addeventtype")
    public String addEventType() {

        System.out.println("ODPALAM EventTypeController!");

        return "addEventType";
    }

    @PostMapping("/addeventtype")
    public String eventTypeForm(Model modle,
            @RequestParam("event_type_name") String eventTypeName
    ) {
        EventType e = new EventType(eventTypeName);

        System.out.println("Zapisuję rodzaj wydarzenie: " + e.toString());

        er.save(e);

        System.out.println("Zapisałem rodzaj wydarzenie: " + e.toString());

        return "addEventType";

    }
    
}
