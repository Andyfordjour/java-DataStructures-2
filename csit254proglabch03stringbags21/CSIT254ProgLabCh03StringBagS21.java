package csit254proglabch03stringbags21;

/**
 * Driver that uses StringBag       -- NO NEED TO CHANGE THIS FILE
 * @author Stephen T. Brower inspired by Michael Main
 */
public class CSIT254ProgLabCh03StringBagS21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // holds data for add/find/delete
        String fruitToAdd, fruitToFind, fruitToDelete;
        
        // create a default sized bag
        StringBag defaultBag = new StringBag();

        // create another bag - fruitBag
        StringBag fruitBag = new StringBag(3);

        // display empty defaultBag
        displayBag("\ndefaultBag upon startup",defaultBag);

        // display empty fruitBag
        displayBag("\nfruitBag upon startup",fruitBag);

        // add fruit to fruitBag
        System.out.println("\nadd some fruits to fruitBag\n");
        
        fruitToAdd = "Pear";
        System.out.println("Adding " + fruitToAdd);
        fruitBag.add(fruitToAdd);

        fruitToAdd = "Plum";
        System.out.println("Adding " + fruitToAdd);
        fruitBag.add(fruitToAdd);

        fruitToAdd = "Peach";
        System.out.println("Adding " + fruitToAdd);
        fruitBag.add(fruitToAdd);

        // display fruitBag after 3 adds
        displayBag("\nfruitBag after 3 adds",fruitBag);

        // add 1 more fruit (fruitBag should grow)
        fruitToAdd = "Mango";
        System.out.println("Adding " + fruitToAdd);
        fruitBag.add(fruitToAdd);

        // show fruitBag after add/grow
        displayBag("\nfruitBag after add/grow",fruitBag);

        System.out.println("\nadd 5 more fruits");
        // add a number more of fruits
        String[] manyMoreFruits = {"pear","apple","plum","watermelon","kiwi"};
        
        for ( String newFruitToAdd : manyMoreFruits ) {
            System.out.println("Adding " + newFruitToAdd);
            fruitBag.add(newFruitToAdd);            
        }
                
        // show fruitBag after multiple adds
        displayBag("\nfruitBag after multiple adds",fruitBag);
        
        // look for fruits in the bag
        System.out.println("\nlook for fruits in the bag");
        
        // does banana exist in fruitBag?
        fruitToFind = "banana";
        System.out.print("\nSearching for " + fruitToFind + "...");
        if (fruitBag.exists(fruitToFind))
            System.out.println("\nYes!  There is a "+fruitToFind+" in the fruitBag!");
        else
            System.out.println("\nNo!  No "+fruitToFind+" in the fruitBag");

        // does plum exist in fruitBag?
        fruitToFind = "plum";
        System.out.print("\nSearching for " + fruitToFind + "...");
        if (fruitBag.exists(fruitToFind))
            System.out.println("Yes!  There is a "+fruitToFind+" in the fruitBag!");
        else
            System.out.println("No!  No "+fruitToFind+" in the fruitBag");

        // count some fruit in fruitBag
        System.out.println("\ncount some fruit in fruitBag\n");
        
        // count bananas
        fruitToFind = "banana";
        System.out.println("Number of "+fruitToFind+" in fruitBag: " 
                + fruitBag.countOccurrences(fruitToFind));
        
        // count plums
        fruitToFind = "plum";
        System.out.println("Number of "+fruitToFind+" in fruitBag: " 
                + fruitBag.countOccurrences(fruitToFind));

        // removes
        System.out.println("\nRemove some fruit\n");
        
        ////////////////////////////////////////////////////////////////
        //                  banana
        
        fruitToDelete = "banana";
        // show fruitBag before call to remove()
        displayBag("\nfruitBag before removing "+fruitToDelete,fruitBag);

        // attempt to remove banana from fruitBag
        if (fruitBag.remove(fruitToDelete))
            System.out.println("\nWas able to remove "+fruitToDelete+" from fruitBag.");
        else
            System.out.println("\nSorry! unable to remove "+fruitToDelete+" from fruitBag!");

        // show fruitBag after call to remove()
        displayBag("\nfruitBag after removing "+fruitToDelete,fruitBag);

        ////////////////////////////////////////////////////////////////
        //                  plum
        
        fruitToDelete="plum";
        // show fruitBag before call to remove()
        displayBag("\nfruitBag before removing "+fruitToDelete,fruitBag);

        // attempt to remove plum from fruitBag
        if (fruitBag.remove(fruitToDelete))
            System.out.println("\nWas able to remove "+fruitToDelete+" from fruitBag.");
        else
            System.out.println("\nSorry! unable to remove "+fruitToDelete+" from fruitBag!");

        displayBag("\nfruitBag after removing "+fruitToDelete,fruitBag);
        
        ////////////////////////////////////////////////////////////////
        //                  Watermelon
        
        fruitToDelete="Watermelon";
        // show fruitBag before call to remove()
        displayBag("\nfruitBag before removing "+fruitToDelete,fruitBag);

        // attempt to remove Watermelon from fruitBag
        if (fruitBag.remove(fruitToDelete))
            System.out.println("\nWas able to remove "+fruitToDelete+" from fruitBag.");
        else
            System.out.println("\nSorry! unable to remove "+fruitToDelete+" from fruitBag!");

        displayBag("\nfruitBag after removing "+fruitToDelete,fruitBag);

        ////////////////////////////////////////////////////////////////
        //                  apple
        
        fruitToDelete="apple";
        // show fruitBag before call to remove()
        displayBag("\nfruitBag before removing "+fruitToDelete,fruitBag);

        // attempt to remove apple from fruitBag
        if (fruitBag.remove(fruitToDelete))
            System.out.println("\nWas able to remove "+fruitToDelete+" from fruitBag.");
        else
            System.out.println("\nSorry! unable to remove "+fruitToDelete+" from fruitBag!");

        displayBag("\nfruitBag after removing "+fruitToDelete,fruitBag);

        // this ends the test of StringBag

    }

    /**
     * the displayBag method displays the StringBag
     *
     * @param heading a String to display before the bag
     * @param aBag the StringBag to display
     */
    public static void displayBag(String heading, StringBag aBag) {
        System.out.println(heading);
        System.out.print("cap=" + aBag.getCapacity() + " n=" + aBag.getSize() + " Bag: ");

        if (aBag.getSize() == 0) {
            System.out.println("Empty");//: Double Check if empty [ " + aBag + "]");
        } else {
            //System.out.println("Not Empty: Check [ " + aBag + "]");
            ListerPrototype1 stringLister = aBag.iteratorPrototype();
            while (stringLister.hasNext()) {
                String displayString = stringLister.next();
                System.out.print("{" + displayString + "}");
                if (stringLister.hasNext()) {
                    System.out.print(", ");
                }
            }
            System.out.println();

        }
    }    
}
