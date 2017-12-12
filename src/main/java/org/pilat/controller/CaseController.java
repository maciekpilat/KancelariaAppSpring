/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.controller;

import org.pilat.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
