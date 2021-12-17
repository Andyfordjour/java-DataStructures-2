/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_bar;

import java.util.Scanner;

/**
 *
 * @author fordjour andy
 */
public class Mini_Bar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        double price;
        int calories;
        //Scanner input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter soda name: ");
        name = keyboard.nextLine();

        System.out.println("Enter price of soda: ");
        price = keyboard.nextDouble();

        System.out.println("Enter calories");
        calories = keyboard.nextInt();

        Soda itemOne = new Soda(name, price, calories);
        //display of item 
        System.out.println("name: " + itemOne.getName());
        System.out.println("price: " + itemOne.getPrice());
        System.out.println("calories: " + itemOne.getCalories());

    }

}
