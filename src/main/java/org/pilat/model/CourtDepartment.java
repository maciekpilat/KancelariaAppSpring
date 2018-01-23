/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table(name = "tab_court_department")
public class CourtDepartment {
    @Id
    @GeneratedValue
    private Long courtDepartmentId;
    private String courtDepartmentName;
}
