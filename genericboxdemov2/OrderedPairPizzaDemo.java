package genericboxdemov2;

/**
 * FAILED Demo for an OrderedPair of Pizza
 * @author Stephen T. Brower
 */
public class OrderedPairPizzaDemo {
    public static void main(String[] args) {
        // declare and instantiate an OrderedPair - but not of pizza
        // this fails!!!  OrderedPair<Pizza> pizzaPair = new OrderedPair<Pizza>();
        // ^^ fails since Pizza is not Comparable
    }
}
