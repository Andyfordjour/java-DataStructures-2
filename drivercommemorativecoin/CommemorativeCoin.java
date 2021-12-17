/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivercommemorativecoin;

/**
 *
 * @author fordjour Andy
 */
public class CommemorativeCoin extends Coin{

// instance for the class
    
    private String event;

    /**
     * Constructor
     *
     * @param initialFaceValue value for the FaceValue field
     * @param initialYearMinted value for the yearMinted field
     * @param initialEvent value for the the event field
     */
    public CommemorativeCoin(String initialEvent, double initialFaceValue, int initialYearMinted) {
        super(initialFaceValue, initialYearMinted);
        event = initialEvent;
    }

    /**
     * getEvent method returns the value for the event field
     *
     * @return value from the event field
     */
    public String getEvent() {
        return event;
    }

    /**
     * setEvent method assigns a new value for the Event Field
     *
     * @param newEvent new value for the event Field
     */
    public void setEvent(String newEvent) {
        event = newEvent;
    }

}
