package finalexam;;

/**
 *              replace this file with your Node from PL05
 * @author Andy Fordjour
 */
public class Node<E> {

    private E data;
    private Node<E> next;

    /**
     * Constructor
     *
     * @param initialData value for the data field
     * @param initialNext value for the next field
     */
    public Node(E initialData, Node<E> initialNext) {
        data = initialData;
        next = initialNext;
    }

    /**
     * getData method returns the value from the data field
     *
     * @return value from the data field
     */
    public E getData() {
        return data;
    }

    /**
     * getNext method returns the value from the next field
     *
     * @return value from the next field
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * setData assigns a new value for data field
     *
     * @param data new value for the data field
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     * setNext assigns a new value for next field
     *
     * @param next new value for the next field
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }
}
