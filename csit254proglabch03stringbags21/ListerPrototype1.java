package csit254proglabch03stringbags21;

import java.util.NoSuchElementException;

/**
 * ListerPrototype1 class for displaying StringBag 
 *                                              -- NO NEED TO CHANGE THIS FILE
 *
 * @author Stephen T. Brower mucked up Michael Main's code
 */
public class ListerPrototype1 {

    private String[] arrayForLister;
    private int index;

    /**
     * Constructor
     *
     * @param initArray array of Strings to be used for the Lister (iterator)
     */
    public ListerPrototype1(String[] initArray) {
        // note: this does not copy the underlying data
        // not good practice but OK for a throw-away prototype
        // and in this case a copy was created from StringBag
        arrayForLister = initArray;
        index = 0;
    }

    /**
     * hasNext method returns a boolean that indicates if more data exists
     *
     * @return boolean that indicates if more data exists
     */
    public boolean hasNext() {
        return index < arrayForLister.length;
    }

    /**
     * next method gets the next element from the array and returns the value
     *
     * @return the next value from the array
     */
    public String next() {
        String valueToReturn;

        // check to see if there are elements
        if (!hasNext()) {
            throw new NoSuchElementException("The lister is empty");
        }

        // get the next value from the array
        valueToReturn = arrayForLister[index];

        // advance to the next index
        index++;

        return valueToReturn;
    }

}
