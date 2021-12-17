// STB Removed - package XXX;
package lab14graph;

import java.util.Scanner;

/**
 * UI for Lab for Ch 14A - let's walk around the house This program is partially
 * written...you will complete the program *** for this Lab, only change THIS
 * file
 *
 * @author Stephen T. Brower - modified by Andy Fordjour
 */
public class UndirectedNonWeightedExampleSlide19House {

    public static void main(String[] args) {
        int currentVertex, userChoice;
        Scanner input = new Scanner(System.in);

        // constants so it's easier to refer to room numbers
        final int KITCHEN = 0;
        final int PANTRY = 1;
        final int DINING_ROOM = 2;
        final int BACK_FOYER = 3;
        final int FRONT_FOYER = 4;
        final int STUDY = 5;
        final int LIVING_ROOM = 6;
        final int STAIRS = 7;
        final int UPSTAIRS_HALLWAY = 8;
        final int MASTER_BEDROOM = 9;
        final int GUEST_BEDROOM = 10;
        final int PLAY_ROOM = 11;
        final int STORE_ROOM = 12;
        final int HOME_THEATER = 13;

        // ^^^ add additional rooms ^^
        // *******************************************
        // create graph using Author's Graph
        Graph myGraph = new Graph(14);
        //                       ^^^change 9 to represesent correct # of rooms

        // put labels on 'rooms'
        myGraph.setLabel(KITCHEN, "Kitchen");
        myGraph.setLabel(PANTRY, "Pantry");
        myGraph.setLabel(DINING_ROOM, "Dining Room");
        myGraph.setLabel(BACK_FOYER, "Back Foyer");
        myGraph.setLabel(FRONT_FOYER, "Front Foyer");
        myGraph.setLabel(STUDY, "Study");
        myGraph.setLabel(LIVING_ROOM, "Living Room");
        myGraph.setLabel(STAIRS, "Stairs");
        myGraph.setLabel(UPSTAIRS_HALLWAY, "Upstairs Hallway");
        myGraph.setLabel(MASTER_BEDROOM, "Master_Bedroom");
        myGraph.setLabel(GUEST_BEDROOM, "Gust_Bedroom");
        myGraph.setLabel(PLAY_ROOM, "Play_Room");
        myGraph.setLabel(STORE_ROOM, "Store_Room");
        myGraph.setLabel(HOME_THEATER, "Home_Theater");

        // ^^^ add additional room labels ^^^
        // *******************************************
        // connect rooms using edges 
        // (the initial undirected Graph has 7 edges, so there are 14 edges)
        myGraph.addEdge(KITCHEN, PANTRY);
        myGraph.addEdge(PANTRY, KITCHEN);

        myGraph.addEdge(PANTRY, DINING_ROOM);
        myGraph.addEdge(DINING_ROOM, PANTRY);

        myGraph.addEdge(DINING_ROOM, FRONT_FOYER);
        myGraph.addEdge(FRONT_FOYER, DINING_ROOM);

        myGraph.addEdge(KITCHEN, BACK_FOYER);
        myGraph.addEdge(BACK_FOYER, KITCHEN);

        myGraph.addEdge(BACK_FOYER, FRONT_FOYER);
        myGraph.addEdge(FRONT_FOYER, BACK_FOYER);

        myGraph.addEdge(FRONT_FOYER, LIVING_ROOM);
        myGraph.addEdge(LIVING_ROOM, FRONT_FOYER);

        myGraph.addEdge(BACK_FOYER, STUDY);
        myGraph.addEdge(STUDY, BACK_FOYER);

        myGraph.addEdge(FRONT_FOYER, STAIRS);
        myGraph.addEdge(STAIRS, FRONT_FOYER);

        myGraph.addEdge(STAIRS, UPSTAIRS_HALLWAY);
        myGraph.addEdge(UPSTAIRS_HALLWAY, STAIRS);
        
        myGraph.addEdge(UPSTAIRS_HALLWAY, MASTER_BEDROOM);
        myGraph.addEdge(MASTER_BEDROOM,UPSTAIRS_HALLWAY );

        myGraph.addEdge(MASTER_BEDROOM, GUEST_BEDROOM);
        myGraph.addEdge(GUEST_BEDROOM, MASTER_BEDROOM);

        myGraph.addEdge(GUEST_BEDROOM, PLAY_ROOM);
        myGraph.addEdge(PLAY_ROOM, GUEST_BEDROOM);

        myGraph.addEdge(PLAY_ROOM, STORE_ROOM);
        myGraph.addEdge(STORE_ROOM, PLAY_ROOM);

        myGraph.addEdge(STORE_ROOM, HOME_THEATER);
        myGraph.addEdge(HOME_THEATER, STORE_ROOM);

        // ^^^ add additional connections to connect your rooms^^^
        // *******************************************
        // let's pretend we are in FRONT_FOYER
        currentVertex = FRONT_FOYER;

        

        do{// <-- might be a good place for the top of a loop
        // display the current vertex
        System.out.println("\nYou are currently in room "
                + currentVertex + "-" + myGraph.getLabel(currentVertex));

        // display our neighbors
        System.out.println("neighbors of " + currentVertex + "-"
                + myGraph.getLabel(currentVertex) + " are:");

        for (int neighbor : myGraph.neighbors(currentVertex)) {
            System.out.printf("%2d-%s\n", neighbor, myGraph.getLabel(neighbor));
        }
        System.out.println();

        // suppose I was interacting with user, (hey, I am)
        // I will ask for their choice
        System.out.print("\nWhere would you like to go? (-1 to exit): ");
        userChoice = input.nextInt();

        // make sure what the user entered is not too small 
        while (userChoice < -1 || userChoice >= myGraph.size()) {
            System.out.println("Not a valid value");
            System.out.print("\nWhere would you like to go? (-1 to exit): ");
            userChoice = input.nextInt();
        }
        // nor too big...for the 'too big', best to check the 
        // 'size' of the graph as opposed to a hardcoded # 

        // the if below doesn't protect against values too small or too big
        // either add a validation loop here to prevent from 
        // getting to the if with a bad value
        // or change the if
        // if their choice is -1 then exit
        if (userChoice == -1) {
            System.out.println("Good bye!");
        } else {
            // if their choice is a valid neighbor
            if (myGraph.isEdge(currentVertex, userChoice)) {
                currentVertex = userChoice;
                // then move to new vertex....
            } else // report the vertex they entered is unreachable
            {
                System.out.println("\nYou can't go to " + userChoice
                        + "-" + myGraph.getLabel(userChoice)
                        + " from " + currentVertex
                        + "-" + myGraph.getLabel(currentVertex));
            }
        }

        }while(userChoice !=  -1);// <-- might be a good place for the bottom of a loop
    }
}
