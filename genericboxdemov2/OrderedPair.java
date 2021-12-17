package genericboxdemov2;

/**
 * OrderedPair class for 2 Comparable objects
 * @author Stephen T. Brower
 */
public class OrderedPair<E extends Comparable<E>> {
    private E item1;
    private E item2;

    /**
     * no-arg constructor
     */
    public OrderedPair() {
        item1 = null;
        item2 = null;
    }

    /**
     * getItem1 method returns the Object in the item1 field
     * @return Object in the item1 field
     */
    public E getItem1() {
        return item1;
    }

    /**
     * getItem2 method returns the Object in the item2 field
     * @return Object in the item2 field
     */
    public E getItem2() {
        return item2;
    }

    /**
     * the addItem method adds an item to an open spot in the Pair object
     * and raises an Exception if no space is available
     * @param newItem Object to be added to the pair
     * @throws PairFullException Exception thrown if the Pair is full
     */
    public void addItem(E newItem) throws PairFullException {
        if (item1 == null) {
            item1 = newItem;
        } else if (item2 == null) {
            if (newItem.compareTo(item1) < 0) {
                item2 = item1;
                item1 = newItem;
            }
            else {
                item2 = newItem;
            }
            
        } else {
            throw new PairFullException();
        }

    }    
}
