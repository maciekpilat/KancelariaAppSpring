/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Pilat
 */
public class ClientAdress {

    @Id
    @GeneratedValue
    private Long clientId;
    private String clientFirstName;
    private String clientLastName;

    @Id
    @GeneratedValue
    private Long adressId;
    private Long adressType; // adres klienta, sadu, miejsca spotkania itp.
    private Long country;
    private Long voivodeship;
    private Long city;
    private String streetName;
    private Long streetNumber;
    private Long streetFlatNumber;

    public ClientAdress(String clientFirstName, String clientLastName, Long adressType, Long country, Long voivodeship, Long city, String streetName, Long streetNumber, Long streetFlatNumber) {
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.adressType = adressType;
        this.country = country;
        this.voivodeship = voivodeship;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.streetFlatNumber = streetFlatNumber;
    }

    @Override
    public String toString() {
        return "ClientAdress{" + "clientId=" + getClientId() + ", clientFirstName=" + getClientFirstName() + ", clientLastName=" + getClientLastName() + ", adress_id=" + getAdressId() + ", adress_type=" + getAdressType() + ", country=" + getCountry() + ", voivodeship=" + getVoivodeship() + ", city=" + getCity() + ", streetName=" + getStreetName() + ", streetNumber=" + getStreetNumber() + ", street_flat_number=" + getStreetFlatNumber() + '}';
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

    /**
     * @return the adressId
     */
    public Long getAdressId() {
        return adressId;
    }

    /**
     * @param adressId the adressId to set
     */
    public void setAdressId(Long adressId) {
        this.adressId = adressId;
    }

    /**
     * @return the adressType
     */
    public Long getAdressType() {
        return adressType;
    }

    /**
     * @param adressType the adressType to set
     */
    public void setAdressType(Long adressType) {
        this.adressType = adressType;
    }

    /**
     * @return the country
     */
    public Long getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Long country) {
        this.country = country;
    }

    /**
     * @return the voivodeship
     */
    public Long getVoivodeship() {
        return voivodeship;
    }

    /**
     * @param voivodeship the voivodeship to set
     */
    public void setVoivodeship(Long voivodeship) {
        this.voivodeship = voivodeship;
    }

    /**
     * @return the city
     */
    public Long getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(Long city) {
        this.city = city;
    }

    /**
     * @return the streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * @param streetName the streetName to set
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * @return the streetNumber
     */
    public Long getStreetNumber() {
        return streetNumber;
    }

    /**
     * @param streetNumber the streetNumber to set
     */
    public void setStreetNumber(Long streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * @return the streetFlatNumber
     */
    public Long getStreetFlatNumber() {
        return streetFlatNumber;
    }

    /**
     * @param streetFlatNumber the streetFlatNumber to set
     */
    public void setStreetFlatNumber(Long streetFlatNumber) {
        this.streetFlatNumber = streetFlatNumber;
    }
    
  

}
