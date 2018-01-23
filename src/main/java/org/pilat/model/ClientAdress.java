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
    private Long adress_id;
    private Long adress_type; // adres klienta, sadu, miejsca spotkania itp.
    private Long country;
    private Long voivodeship;
    private Long city;
    private String street_name;
    private Long street_number;
    private Long street_flat_number;

    public ClientAdress(String clientFirstName, String clientLastName, Long adress_type, Long country, Long voivodeship, Long city, String street_name, Long street_number, Long street_flat_number) {
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.adress_type = adress_type;
        this.country = country;
        this.voivodeship = voivodeship;
        this.city = city;
        this.street_name = street_name;
        this.street_number = street_number;
        this.street_flat_number = street_flat_number;
    }

    @Override
    public String toString() {
        return "ClientAdress{" + "clientId=" + clientId + ", clientFirstName=" + clientFirstName + ", clientLastName=" + clientLastName + ", adress_id=" + adress_id + ", adress_type=" + adress_type + ", country=" + country + ", voivodeship=" + voivodeship + ", city=" + city + ", street_name=" + street_name + ", street_number=" + street_number + ", street_flat_number=" + street_flat_number + '}';
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
     * @return the adress_id
     */
    public Long getAdress_id() {
        return adress_id;
    }

    /**
     * @param adress_id the adress_id to set
     */
    public void setAdress_id(Long adress_id) {
        this.adress_id = adress_id;
    }

    /**
     * @return the adress_type
     */
    public Long getAdress_type() {
        return adress_type;
    }

    /**
     * @param adress_type the adress_type to set
     */
    public void setAdress_type(Long adress_type) {
        this.adress_type = adress_type;
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
     * @return the street_name
     */
    public String getStreet_name() {
        return street_name;
    }

    /**
     * @param street_name the street_name to set
     */
    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    /**
     * @return the street_number
     */
    public Long getStreet_number() {
        return street_number;
    }

    /**
     * @param street_number the street_number to set
     */
    public void setStreet_number(Long street_number) {
        this.street_number = street_number;
    }

    /**
     * @return the street_flat_number
     */
    public Long getStreet_flat_number() {
        return street_flat_number;
    }

    /**
     * @param street_flat_number the street_flat_number to set
     */
    public void setStreet_flat_number(Long street_flat_number) {
        this.street_flat_number = street_flat_number;
    }

}
