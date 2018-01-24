/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.ModelEvent;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.pilat.model.Party;

/**
 *
 * @author Pilat
 */
public class Event {

    @Id
    @GeneratedValue
    private Long eventId;
    private EventType eventType;
    private Date startDate;
    private Date endDate;
    private String eventText;
    @ManyToOne
    private Party party;

    public Event(Long eventId, EventType eventType, Date startDate, Date endDate, String eventText, Party party) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.eventText = eventText;
        this.party = party;
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
    public EventType getEventType() {
        return eventType;
    }

    /**
     * @param eventType the eventType to set
     */
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the eventText
     */
    public String getEventText() {
        return eventText;
    }

    /**
     * @param eventText the eventText to set
     */
    public void setEventText(String eventText) {
        this.eventText = eventText;
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
