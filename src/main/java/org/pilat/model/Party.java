/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.model;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table(name = "tab_parties")
public class Party {
    @Id
    @GeneratedValue
    private Long partyId;
    private Long partyType;
    private String partyFirstName;
    private String partyLastName;
    private String partyTitle;
    private Long partyClient; //0/1 - czy jest klientem czy nie
    
    @ManyToMany
    private Collection<Case> casex = new ArrayList<Case>();
}
