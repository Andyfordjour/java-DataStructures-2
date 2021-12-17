/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_bar;

/**
 *
 * @author fordjour Andy
 */
public class Soda extends Beverage {

    private int calories;

    /**
     * constructor
     * @param initialName value for the Name
     * @param initialPrice value for the Price
     * @param initialCalories value for the Calories
     */
    public Soda(String initialName, double initialPrice, int initialCalories) {
        super(initialName, initialPrice);
        calories = initialCalories;
    }

    /**
     * getCalories method returns the value from the calories field
     *
     * @return value from the calories field
     */
    public int getCalories() {
        return calories;
    }

    /**
     * setCalories assigns a new value for the calories field
     *
     * @param initialCalories new value for the calories field
     */
    public void setCalories(int initialCalories) {
        calories = initialCalories;
    }

}