/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pilat.ModelEvent;

/**
 *
 * @author Pilat
 */
public enum EventType {

    mailReceived("OTRZYMANIE.POCZTY"),
    mailSend("WYSŁANIE POCZTY"),
    call("ROZMOWA TELEFONICZNA"),
    hearing("ROZPRAWA");

    private String eventTypeName;

    private EventType(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public String eventTypeName() {
        return eventTypeName;
    }
}
