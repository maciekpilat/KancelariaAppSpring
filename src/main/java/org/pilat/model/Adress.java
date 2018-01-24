/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table(name = "adress")
public class Adress {

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
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Client client;

    @Override
    public String toString() {
        return "Adress{" + "adress_id=" + getAdressId() + ", adress_type=" + getAdressType() + ", country=" + getCountry() + ", voivodeship=" + getVoivodeship() + ", city=" + getCity() + ", street_name=" + getStreetName() + ", street_number=" + getStreetNumber() + ", street_flat_number=" + getStreetFlatNumber() + '}';
    }

    // konstruktor bezargumentowy dla JPA
    public Adress() {
    }

    public Adress(Long adressType, Long country, Long voivodeship, Long city, String streetName, Long streetNumber, Long streetFlatNumber) {
        //this.adress_id = adress_id;
        this.adressType = adressType;
        this.country = country;
        this.voivodeship = voivodeship;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.streetFlatNumber = streetFlatNumber;
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

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }



}
