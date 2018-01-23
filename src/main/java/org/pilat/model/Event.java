/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Pilat
 */
@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue
    private Long eventId;
    private Long eventType;
    @ManyToOne
    private EventType eventTypeT;
    @ManyToOne
    private Party party;

    // konstruktor bezargumentowy dla JPA
    public Event() {
    }

    public Event(Long eventType) {
        this.eventType = eventType;
    }

    /**
     * @return the eventId
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * @param eventId the eventId to set
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**
     * @return the eventType
     */
    public Long getEventType() {
        return eventType;
    }

    /**
     * @param eventType the eventType to set
     */
    public void setEventType(Long eventType) {
        this.eventType = eventType;
    }

    /**
     * @return the eventTypeT
     */
    public EventType getEventTypeT() {
        return eventTypeT;
    }

    /**
     * @param eventTypeT the eventTypeT to set
     */
    public void setEventTypeT(EventType eventTypeT) {
        this.eventTypeT = eventTypeT;
    }

    /**
     * @return the party
     */
    public Party getParty() {
        return party;
    }

    /**
     * @param party the party to set
     */
    public void setParty(Party party) {
        this.party = party;
    }

    

   

   
}
