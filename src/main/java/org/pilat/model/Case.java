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
@Table(name = "tab_case")
public class Case {

    @Id
    @GeneratedValue
    private Long caseId;
    private String caseTitle;
    private String caseStartDate;
    private String dateEndDate;
    private Long clientId;

    public Case(String caseTitle, String caseStartDate, String dateEndDate, Long clientId) {
        this.caseTitle = caseTitle;
        this.caseStartDate = caseStartDate;
        this.dateEndDate = dateEndDate;
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "Case{" + "caseId=" + getCaseId() + ", caseTitle=" + getCaseTitle() + ", caseStartDate=" + getCaseStartDate() + ", dateEndDate=" + getDateEndDate() + ", ClientId=" + getClientId() + '}';
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
     * @return the dateEndDate
     */
    public String getDateEndDate() {
        return dateEndDate;
    }

    /**
     * @param dateEndDate the dateEndDate to set
     */
    public void setDateEndDate(String dateEndDate) {
        this.dateEndDate = dateEndDate;
    }

    /**
     * @return the clientId
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * @param clientId the clientId to set
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

 
}
