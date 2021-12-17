package genericboxdemov2;

/**
 * Demo for an OrderedPair of Integer
 * @author Stephen T. Brower
 */
public class OrderedPairIntegerDemo {
    public static void main(String[] args) {
        // declare and instantiate an OrderedPair
        OrderedPair<Integer> integerPair = new OrderedPair<Integer>();
        // create integers to add
        Integer integerToAdd = 8;
        Integer anotherIntegerToAdd = 6;
        
        // try to add an integer
        try {
            integerPair.addItem(integerToAdd);
            System.out.println(integerToAdd + " added to integerPair:");
        } catch (PairFullException e) {
            System.out.println("integerPair full - unable to add: " + integerToAdd);
        }

        // try to add another integer
        try {
            integerPair.addItem(anotherIntegerToAdd);
            System.out.println(anotherIntegerToAdd + " added to integerPair:");
        } catch (PairFullException e) {
            System.out.println("integerPair full - unable to add: " + anotherIntegerToAdd);
        }

        // display pair ( should be ordered )
        System.out.println("\nDisplay integerPair:");
        System.out.println("integerPair item1:" + integerPair.getItem1());
        System.out.println("integerPair item2:" + integerPair.getItem2());    
    }
}
