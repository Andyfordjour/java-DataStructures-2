package genericboxdemov2;

/**
 *
 * @author Stephen T. Brower<stephen.brower@raritanval.edu>
 */
public class Box<E> {

    private E item;
    private int numItems;

    /**
     * Constructor
     * @param initialItem an Object to be used for the item field
     * @param initialNumItems value for the numItems field
     */
    public Box(E initialItem, int initialNumItems) {
        item = initialItem;
        numItems = initialNumItems;
    }

    /**
     * getItem method returns the Object in the item field
     * @return Object in the item field
     */
    public E getItem() {
        return item;
    }

    /**
     * getNumItems return the value in the numItems field
     * @return value from the numItems field
     */
    public int getNumItems() {
        return numItems;
    }

    /**
     * setItem method assigns a new Object to the item field
     * @param newItem new Object for the item field
     */
    public void setItem(E newItem) {
        item = newItem;
    }

    /**
     * setNumItems assigns a new value for the numItems field
     * @param newNumItems new value for the numItems field
     */
    public void setNumItems(int newNumItems) {
        numItems = newNumItems;
    }

}
