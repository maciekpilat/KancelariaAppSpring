/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.controller;

import org.pilat.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.pilat.repository.EventRepository;

/**
 *
 * @author Pilat
 */
@Controller
public class EventController {

    @Autowired
    private EventRepository er;

    @RequestMapping("/addevent")
    public String addEvent() {

        System.out.println("ODPALAM EventController!");

        return "addEvent";
    }

    @PostMapping("/addevent")
    public String eventForm(Model modle,
            @RequestParam("event_type") Long event_type
    ) {
        Event e = new Event(event_type);

        System.out.println("Zapisuję wydarzenie: " + e.toString());

        er.save(e);

        System.out.println("Zapisałem wydarzenie: " + e.toString());

        return "addCase";

    }

}
