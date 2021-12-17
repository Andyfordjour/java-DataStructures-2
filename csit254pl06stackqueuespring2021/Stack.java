package csit254pl06stackqueuespring2021;

/**
 *
 * @author Andy Fordjour
 */
public class Stack<E> {

    private Node<E> top;
    private int numElements;

    /**
     * no-arg constructor
     */
    public Stack() {
        top = null;
        numElements = 0;
    }

    /**
     * push method push the element on to the stack
     *
     * @param element the value to be added to the stack
     */
    public void push(E element) {
        top = new Node<E>(element, top);
        numElements++;
    }

    /**
     * pop method returns value from the stack
     * @return the value on top of the stack
     * @throws EmptyStack if stack is empty
     */
    public E pop()
            throws EmptyStack {
        E returnValue;
        if (top == null) {
            throw new EmptyStack();
        } else {
            returnValue = top.getData();
            top = top.getNext();
            numElements--;
        }
        return returnValue;
    }

    /**
     * size returns size of the stack
     *
     * @return the number of elements in the stack
     */
    public int size() {
        return numElements;
    }
}
