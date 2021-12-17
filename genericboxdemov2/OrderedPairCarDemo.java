package genericboxdemov2;

/**
 * Demo for an OrderedPair of Car
 * @author Stephen T. Brower
 */
public class OrderedPairCarDemo {
    public static void main(String[] args) {
        // declare and instantiate an OrderedPair
        OrderedPair<Car> carPair = new OrderedPair<Car>();
        // create cars to add
        Car carToAdd = new Car(1971, "LeMans");
        Car anotherCarToAdd = new Car(1965, "Shelby");
        
        // try to add a car
        try {
            carPair.addItem(carToAdd);
            System.out.println(carToAdd + " added to carPair:");
        } catch (PairFullException e) {
            System.out.println("carPair full - unable to add: " + carToAdd);
        }

        // try to add another car
        try {
            carPair.addItem(anotherCarToAdd);
            System.out.println(anotherCarToAdd + " added to carPair:");
        } catch (PairFullException e) {
            System.out.println("carPair full - unable to add: " + anotherCarToAdd);
        }

        // display pair ( should be ordered )
        System.out.println("\nDisplay carPair:");
        System.out.println("carPair item1:" + carPair.getItem1());
        System.out.println("carPair item2:" + carPair.getItem2());
        
    }
}
