/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table(name = "sl_court_type")
public class CourtType {
    @Id
    @GeneratedValue
    private Long courtTypeId;
    private String courtTypeName;
    
    @OneToMany
    Collection<Court> courtsList;
}
