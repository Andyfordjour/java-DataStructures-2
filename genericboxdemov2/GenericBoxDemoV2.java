package genericboxdemov2;

/**
 * Demo using Box<E> version 2 ( 10/8/2019 )
 * @author Stephen T. Brower
 */
public class GenericBoxDemoV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create some boxes using the generic Box<E> class

        // create boxes of Pizza
        Box<Pizza> pizzaBox1 = new Box<Pizza>(new Pizza(1, 1, "Sausage"), 2);
        Box<Pizza> pizzaBox2 = new Box<Pizza>(new Pizza(3, 1, "Meatball"), 4);

        // create boxes of Car
        Box<Car> carBox1 = new Box<Car>(new Car(1971, "LeMans"), 6);
        Box<Car> carBox2 = new Box<Car>(new Car(1965, "Shelby"), 1);

        // create boxes of Integer
        Box<Integer> integerBox1 = new Box<Integer>(8, 3);
        Box<Integer> integerBox2 = new Box<Integer>(6, 5);

        // create boxes of Boolean
        Box<Boolean> booleanBox1 = new Box<Boolean>(true, 3);
        Box<Boolean> booleanBox2 = new Box<Boolean>(false, 3);

        // display the boxes
        System.out.println("Box Pizza 1: item:{ " + pizzaBox1.getItem() + " } #: " 
                + pizzaBox1.getNumItems());
        System.out.println("Box Pizza 2: item:{ " + pizzaBox2.getItem() + " } #: " 
                + pizzaBox2.getNumItems());

        System.out.println("\nBox Car 1: item:{ " + carBox1.getItem() + " } #: " 
                + carBox1.getNumItems());
        System.out.println("Box Car 2: item:{ " + carBox2.getItem() + " } #: " 
                + carBox2.getNumItems());

        System.out.println("\nBox Integer 1: item:{ " + integerBox1.getItem() 
                + " } #: " + integerBox1.getNumItems());
        System.out.println("Box Integer 2: item:{ " + integerBox2.getItem() 
                + " } #: " + integerBox2.getNumItems());

        System.out.println("\nBox Boolean 1: item:{ " + booleanBox1.getItem() 
                + " } #: " + booleanBox1.getNumItems());
        System.out.println("Box Boolean 2: item:{ " + booleanBox2.getItem() 
                + " } #: " + booleanBox2.getNumItems());
    }

}
