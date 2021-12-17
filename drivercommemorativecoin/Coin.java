/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivercommemorativecoin;

/**
 * super class for coin
 *
 * @author fordjour Andy
 */
public class Coin {

    //instances for the class
    private double faceValue;
    private int yearMinted;

    /**
     * constructor
     *
     * @param initialFaceValue value for the FaceValue field
     * @param initialYearMinted value for the YearMinted field
     */
    public Coin(double initialFaceValue, int initialYearMinted) {
        faceValue = initialFaceValue;
        yearMinted = initialYearMinted;
    }

    /**
     * getFaceValue method returns the value from the the faceValue Field
     *
     * @return value from the FaceValue field
     */
    public double getFaceValue() {
        return faceValue;
    }

    /**
     * getYearMinted method returns the value for the yearMinted field
     *
     * @return value from the yearMinted field
     */
    public int getYearMinted() {
        return yearMinted;
    }

    /**
     * setFaceValue method assigns a new value for the the faceValue field
     *
     * @param newFaceValue new value for the FaceValue field
     */
    public void setFaceValue(double newFaceValue) {
        faceValue = newFaceValue;
    }

    /**
     * setYearMinted method assigns a new value for the yearMinted field
     *
     * @param newYearMinted new value for the yearMinted field
     */
    public void setYearMinted(int newYearMinted) {
        yearMinted = newYearMinted;
    }

}
