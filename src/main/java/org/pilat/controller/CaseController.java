/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.controller;

import org.pilat.model.Case;
import org.pilat.repository.CaseRepository;
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
public class CaseController {

    @Autowired
    private CaseRepository cr;

    @RequestMapping("/addcase")
    public String caseController() {

        return "addCase";
    }

    @PostMapping("/addcase")
    public String caseForm(Model modle,
            @RequestParam("caseTitle") String caseTitle,
            @RequestParam("caseStartDate") String caseStartDate,
            @RequestParam("dateEndDate") String dateEndDate,
            @RequestParam("clientId") Long clientId
    ) {
        Case c = new Case(caseTitle, caseStartDate, dateEndDate);

        System.out.println("Zapisuję sprawę: " + c.toString());
        
        cr.save(c);
        
        System.out.println("Zapisałem sprawę: " + c.toString());
        
        return "addCase";

    }

}