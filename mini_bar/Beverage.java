/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_bar;

/**
 *
 * @author fordjour andy
 */
public class Beverage {

    private String name;
    private double price;

    /**
     * constructor
     *
     * @param initialName value for the name
     * @param initialPrice value for the price
     */
    public Beverage(String initialName, double initialPrice) {
        name = initialName;
        price = initialPrice;
    }

    /**
     * getName method returns the value form the name field
     *
     * @return value from the name field
     */
    public String getName() {
        return name;
    }

    /**
     * getPricemethod returns the value form the price field
     *
     * @return value form the price field
     */
    public double getPrice() {
        return price;
    }

    /**
     * setName method assigns a new value for the name field
     *
     * @param initialName new value for the name field
     */
    public void setName(String initialName) {
        name = initialName;
    }

    /**
     * setPrice method assigns a new value for the price field
     *
     * @param initialPrice new value for the price field
     */
    public void setPrice(double initialPrice) {
        price = initialPrice;
    }

}
