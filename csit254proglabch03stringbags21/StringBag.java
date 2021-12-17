package csit254proglabch03stringbags21;

/**
 * StringBag for Programming Lab for Ch 3 you are editing this file!
 * 
 * you do not need to keep the underlines _______
 *
 * @author Michael Main and Stephen T. Brower 
 * Modified by:  Andy Fordjour
 *                  ^^^ (1) your name here ^^^
 */
public class StringBag {

    private String[] data;      // declares the array data
    private int numElements;    // since data is a partially filled array, this
                                // keeps track of how many elements are populated

    /**
     * Constructor
     *
     * @param initialCapacity value for the data field
     *                          ^^^ (2) parameter description - describe value received ^^^
     */
    public StringBag(int initialCapacity) {
        data = new String[initialCapacity]; // allocates initialCapacity elements ( we assume it's valid )
        numElements = 0;
    }

    /**
     * No-Arg Constructor
     */
    public StringBag() {
        data = new String[10]; // allocates 10 elements
        numElements = 0;
    }

    /**
     * getCapacity method returns value from the capacity field 
     *                     ^^^ (3) method description - describe the action(s) ^^^
     *
     * @return value for the capacity of the array
     *          ^^^ (4) return description - describe value returned ^^^
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * getSize method returns value for the size 
     *              ^^^ (5) method description - describe the action(s) ^^^
     *
     * @return value for the numElements field
     * ^^^ (6) return description - describe value returned ^^^
     */
    public int getSize() {
        return numElements;
    }

    /**
     * add method add new elements to the array and also enlarge the data.length 
     *              ^^^ (7) method description - describe the action(s) ^^^
     *
     * @param newElement value for the add field 
     *                  ^^^ (8) parameter description - describe value received ^^^
     */
    public void add(String newElement) {
        // are we at capacity?
        if (numElements == data.length) {
            // make the array bigger
            enlargeArray();
        }

        // this version adds to the end of the array
        data[numElements] = new String(newElement);
        numElements++;

        // an extra credit option is to replace the 2 prior lines
        // with code to maintain a..z order using an O(n) algorithm
    }

    /**
     * enlargeArray method enlarge the size of the data.length
     *                      ^^^ (9) method description - describe the action(s) ^^^
     */
    private void enlargeArray() {
        // create an array that's bigger than data
        String[] newArray = new String[data.length * 2 + 1];

        // copy the values from data array to newArray
        for (int i = 0; i < data.length; i++) {
            newArray[i] = new String(data[i]);
        }

        // make data point to the new larger array
        data = newArray;
    }

    /**
     * exists method  shows if a target is present in an array
     *                  ^^^ (10) method description - describe the action(s) ^^^
     *
     * @param target  value for the exists field 
     *                  ^^^ (11) parameter description - describe value received ^^^
     * @return true or false for the found whether it exist or not 
     *          ^^^ (12) return description - describe value returned ^^^
     */
    public boolean exists(String target) {
        boolean found = false; // we haven't found it yet
        
        // initialize pointer to the beginning of the 'array'
        int i = 0;

        // while we haven't found the element and 
        //       we haven't reached the end of the populated portion of the 'array'
        while (!found && i < numElements) {
            // is the element that i is pointing to the same as the target?
            if (data[i].equalsIgnoreCase(target)) {
                found = true; // we found it!
            } else {
                i++; // move pointer to next element in 'array'
            }
        }

        return found;
    }

    /**
     * countOccurrences method shows how may times a target appeared in an array 
     *                          ^^^ (13) method description - describe the action(s) ^^^
     *
     * @param target value for the countOccurrences field 
     *                  ^^^ (14) parameter description - describe value received ^^^
     * @return value for the count Occurrences
     *          ^^^ (15) return description - describe value returned ^^^
     */
    public int countOccurrences(String target) {
        int numOccur = 0;

        // first, initialize pointer to the beginning of the 'array' 
        //    test: check that we haven't reached the end of the populated elements in the array
        //          update: // move pointer to next element in 'array'
        for (int i = 0; i < numElements; i++) {
            // is the element that i is pointing to the same as the target?
            if (data[i].equalsIgnoreCase(target)) {
                numOccur++; // add 1 to counter
            }
        }

        return numOccur;
    }

    /**
     * remove method remove a target from the array 
     *                  ^^^ (16) method description - describe the action(s) ^^^
     *
     * @param target value to be remove  
     *                  ^^^ (17) parameter description - describe value received ^^^
     * @return true or false for whether the value is remove or not 
     *          ^^^ (18) return description - describe value returned ^^^
     */
    public boolean remove(String target) {
        boolean found = false; // we haven't found it yet

        // initialize pointer to the beginning of the 'array'
        int i = 0;

        // while we haven't found the element and 
        //       we haven't reached the end of the populated portion of the 'array'
        while (!found && i < numElements) {
            // is the element that i is pointing to the same as the target?
            if (data[i].equalsIgnoreCase(target)) {
                found = true;  // we found it!
            } else {
                i++; // move pointer to next element in 'array'
            }
        }

        // if we found it, remove it
        if (found) {
            // overlay the spot that i points to with the value at the end of the array
            data[i] = data[numElements - 1];
            numElements--;
            // note: this logic removes the first occurrence of target, not all occurrences
        }

        // an extra credit option is to replace the 2 above lines
        // ( either just the lines in the if (found) or all
        // of the code in the method
        // with code to maintain physical order using an O(n) algorithm
        return found;
    }

    /**
     * iteratorPrototype method creates a copy of the data and creates an
     * iterator from the copied array
     *
     * @return an iterator using ListerPrototype1 created from a copy of data
     */
    public ListerPrototype1 iteratorPrototype() {
        // since the data array is partially filled, create a copy
        // that is just a size of the number of elements filled
        String[] copyToReturn = new String[numElements];

        // loop through array and copy data to copy array
        for (int i = 0; i < numElements; i++) {
            copyToReturn[i] = data[i];
        }

        // instantiate a ListerProtoype1 using the copied array
        return new ListerPrototype1(copyToReturn);
    }
}
