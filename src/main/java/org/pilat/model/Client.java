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
import org.pilat.model.Case;

/**
 *
 * @author Pilat
 */
@Entity
@Table(name = "tab_clenta")
public class Client {

    @Id
    @GeneratedValue
    private Long clientId;
    private String clientFirstName;
    private String clientLastName;
    
    @ManyToMany
    private Collection<Case> casex = new ArrayList<Case>();
    

    @Override
    public String toString() {
        return "Client{" + "clientId=" + clientId + ", clientFirstName=" + clientFirstName + ", clientLastName=" + clientLastName + '}';
    }

public Client(String clientFirstName, String clientLastName){
    this.clientFirstName = clientFirstName;
    this.clientLastName = clientLastName;
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

    /**
     * @return the clientFirstName
     */
    public String getClientFirstName() {
        return clientFirstName;
    }

    /**
     * @param clientFirstName the clientFirstName to set
     */
    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    /**
     * @return the clientLastName
     */
    public String getClientLastName() {
        return clientLastName;
    }

    /**
     * @param clientLastName the clientLastName to set
     */
    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

}
