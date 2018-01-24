/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.modeleventenum;

import java.util.Date;
import org.pilat.model.Party;

/**
 *
 * @author Pilat
 */
public class EventHearing extends Event {

    private String hearingAdress;

    public EventHearing(Long eventId, EventType eventType, Date startDate, Date endDate, String eventText, Party party) {
        super(eventId, eventType, startDate, endDate, eventText, party);
    }

    /**
     * @return the hearingAdress
     */
    public String getHearingAdress() {
        return hearingAdress;
    }

    /**
     * @param hearingAdress the hearingAdress to set
     */
    public void setHearingAdress(String hearingAdress) {
        this.hearingAdress = hearingAdress;
    }
}
