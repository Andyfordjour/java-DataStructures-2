package genericboxdemov2;

/**
 * Demo of overloaded methods Date Written 10/3/2012
 *
 * @author Concept by: Tony Gaddis (et al) modified by Stephen Brower
 */
public class DisplayNeat {

    /**
     * number method takes an int and makes it pretty
     *
     * @param number to be made pretty
     * @return String as pretty version of number
     */
    public static String number(int number) {
        return String.format("%,d", number);
    }

    /**
     * * number method takes a double and makes it pretty
     *
     * @param number to be made pretty
     * @return String as pretty version of number
     */
    public static String number(double number) {
        return String.format("%,.2f", number);
    }
}
