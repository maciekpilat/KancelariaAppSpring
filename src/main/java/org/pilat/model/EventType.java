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
@Table(name = "sl_event_type")
public class EventType {

    @Id
    @GeneratedValue
    private Long eventTypeId;
    private String eventTypeName;

    // konstruktor bezargumentowy dla JPA
    public EventType() {
    }

    public EventType(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * @return the eventTypeId
     */
    public Long getEventTypeId() {
        return eventTypeId;
    }

    /**
     * @param eventTypeId the eventTypeId to set
     */
    public void setEventTypeId(Long eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    /**
     * @return the eventTypeName
     */
    public String getEventTypeName() {
        return eventTypeName;
    }

    /**
     * @param eventTypeName the eventTypeName to set
     */
    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }



}
