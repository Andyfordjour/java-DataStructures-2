/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_04;

/**
 *
 * @author fordj
 */
public class StringLinkedBag {

    private StringNode head;
    private StringNode tail;
    private int numElement;

    /**
     * constructor
     */
    public StringLinkedBag() {

        head = null;
        tail = null;
        numElement = 0;
    }

    /**
     * getSize method returns the bags current size
     *
     * @return returns the number of values in the bag
     */
    public int getSize() {
        return numElement;
    }

    /**
     * add method adds a value to the bag
     *
     * @param element the value to be added to the bag
     */
    public void add(String element) {
        if (tail == null) // is list empty?
        {
            head = new StringNode(element, null);
            tail = head;
        } else {
            tail.setNext(new StringNode(element, null));
            tail = tail.getNext();
        }
        numElement++;
    }

    public boolean exists(String target) {
        boolean found = false; // we haven't found it yet
        StringNode cursor = head;
        // initialize pointer to the beginning of the 'cursor'

        // while we haven't found the element and 
        //       we haven't reached the end of the populated portion of the 'cursor'
        while (cursor != null && !found) {
            // is the element that i is pointing to the same as the target?
            if (target.equals(cursor.getData())) {
                found = true; // we found it!
            } else {
                cursor = cursor.getNext();
            }
        }

        return found;
    }

    /**
     * countOccurrences method looks for the number of times a value is in the
     * bag
     *
     * @param target the value to be found in the bag
     * @return an int with the number of times target is found in the bag
     */
    public int countOccurrences(String target) {
        int numOccur = 0;
        StringNode cursor = head;
        // first, initialize pointer to the beginning of the 'array' 
        //    test: check that we haven't reached the end of the populated elements in the array
        //          update: // move pointer to next element in 'cursor'
        for (int i = 0; i < numElement; i++) {
            // is the element that i is pointing to the same as the target?
            if (target.equalsIgnoreCase(cursor.getData())) {
                numOccur++; // add 1 to counter
            }
        }

        return numOccur;
    }

    /**
     *
     * @param target
     * @return
     */
    public boolean remove(String target) {
        boolean found = false; // we haven't found it yet
        StringNode cursor = head, previous = null; //

        // initialize pointer to the beginning of the 'array'
        // while we haven't found the element and 
        //       we haven't reached the end of the populated portion of the 'array'
        while (cursor != null && !found) {
            // is the element that i is pointing to the same as the target?
            if (target.equalsIgnoreCase(cursor.getData())) {
                found = true;  // we found it!
            } else {
                previous = cursor;
                cursor = cursor.getNext();// move pointer to next element in 'array'
            }
        }

        // if we found it, remove it
        if (found && cursor != null) {
            // overlay the spot that i points to with the value at the end of the array
            if (previous == null) 
                head = head.getNext();
            
            // note: this logic removes the first occurrence of target, not all occurrences
         else 
            previous.setNext(cursor.getNext());
        
        if (tail == cursor) {
            tail = previous;
        }
        numElement--;
        }
        return found;
    }
    
  /**
     * the iteratorPrototype method "copies" the linked list and passes the
     * copied linked list to a new ListerPrototype2
     *
     * @return a ListerPrototype2 using a copy of the linked list
     */
    public ListerPrototype2 iteratorPrototype() {
        // declare variables
        StringNode headOfListToReturn; // beginning of new "copied" list
        StringNode cursorOfListToCopy; // active node of list to copy
        StringNode lastNodeOfListToReturn; // end of new "copied" list

        // establish the copied list
        headOfListToReturn = null;

        if (head != null) {
            // create the head of the new list
            headOfListToReturn = new StringNode(head.getData(), null);
            // use lastNodeOfListToReturn as a pointer to the last node in the copied list
            lastNodeOfListToReturn = headOfListToReturn;
            // use currentCursor as the pointer to the existing list
            cursorOfListToCopy = head.getNext();
            // if we have a node...
            while (cursorOfListToCopy != null) {
                // create a new node from the end of the new list
                lastNodeOfListToReturn.setNext(new StringNode(cursorOfListToCopy.getData(), null));
                // move lastNodeOfListToReturn to the new last node
                lastNodeOfListToReturn = lastNodeOfListToReturn.getNext();
                // move the cursorOfListToCopy to the next node
                cursorOfListToCopy = cursorOfListToCopy.getNext();
            }
        }

        return new ListerPrototype2(headOfListToReturn);
    }

}