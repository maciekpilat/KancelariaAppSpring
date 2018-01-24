/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.model;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.pilat.model.Client;

/**
 *
 * @author Pilat
 */
@Entity
@Table(name = "tab_case")
public class Case {

    @Id
    @GeneratedValue
    private Long caseId;
    private String caseTitle;
    private String caseStartDate;
    private String caseEndDate;
    
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Client> client = new ArrayList<Client>();

    
    
    
    
    
    public Case(String caseTitle, String caseStartDate, String caseEndDate) {
        this.caseTitle = caseTitle;
        this.caseStartDate = caseStartDate;
        this.caseEndDate = caseEndDate;
    }

    @Override
    public String toString() {
        return "Case{" + "caseId=" + getCaseId() + ", caseTitle=" + getCaseTitle() + ", caseStartDate=" + getCaseStartDate() + ", caseEndDate=" + getCaseEndDate() + ", client=" + getClient() + '}';
    }

    /**
     * @return the caseId
     */
    public Long getCaseId() {
        return caseId;
    }

    /**
     * @param caseId the caseId to set
     */
    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    /**
     * @return the caseTitle
     */
    public String getCaseTitle() {
        return caseTitle;
    }

    /**
     * @param caseTitle the caseTitle to set
     */
    public void setCaseTitle(String caseTitle) {
        this.caseTitle = caseTitle;
    }

    /**
     * @return the caseStartDate
     */
    public String getCaseStartDate() {
        return caseStartDate;
    }

    /**
     * @param caseStartDate the caseStartDate to set
     */
    public void setCaseStartDate(String caseStartDate) {
        this.caseStartDate = caseStartDate;
    }

    /**
     * @return the caseEndDate
     */
    public String getCaseEndDate() {
        return caseEndDate;
    }

    /**
     * @param caseEndDate the caseEndDate to set
     */
    public void setCaseEndDate(String caseEndDate) {
        this.caseEndDate = caseEndDate;
    }

    /**
     * @return the client
     */
    public Collection<Client> getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Collection<Client> client) {
        this.client = client;
    }



 
}
