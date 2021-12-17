/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivercommemorativecoin;

import java.util.Scanner;

/**
 *
 * @author fordjour Andy
 */
public class DriverCommemorativeCoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaration of variables
        double faceValue;
        int yearMinted;
        String event;

        //Scanner type 
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Event: ");
        event = keyboard.nextLine();

        System.out.println("Enter Face value: ");
        faceValue = keyboard.nextDouble();

        System.out.println("Enter Year Minted");
        yearMinted = keyboard.nextInt();

        //passing data as an argument to the constructor 
        CommemorativeCoin myCommemorativeCoin = new CommemorativeCoin(event, faceValue, yearMinted);

        //display result 
        System.out.println("Event: " + myCommemorativeCoin.getEvent());
        System.out.println("Face value: " + myCommemorativeCoin.getFaceValue());
        System.out.println("Year Minted: " + myCommemorativeCoin.getYearMinted());

        System.out.println("\nLet's change the coin!\n");
        // System.out.println(.setFaceValue(myCoin.getFaceValue()+.1));

        //second call of setters 
        myCommemorativeCoin.setFaceValue(myCommemorativeCoin.getFaceValue() + .10);
        myCommemorativeCoin.setEvent(myCommemorativeCoin.getEvent() + " V2");
        myCommemorativeCoin.setYearMinted(myCommemorativeCoin.getYearMinted() + 1);

        //display second call of setters
        System.out.println("Event: " + myCommemorativeCoin.getEvent());
        System.out.println("Face value: " + myCommemorativeCoin.getFaceValue());
        System.out.println("Year Minted: " + myCommemorativeCoin.getYearMinted());

    }

}
