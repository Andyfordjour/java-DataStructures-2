package csit254project03simulationusingqueues21;

/**
 * your Queue from Lab 6
 * @author ???
 */
public class Queue<E> {
    private Node<E> front;
    private Node<E> rear;
    private int numElements;

    /**
     * no-arg Constructor
     */
    public Queue() {
        front = null;
        rear = null;
        numElements = 0;
    }

    /**
     * add method adds a value to the queue
     *
     * @param element the value to be added to the queue
     */
    public void add(E element) {

        if (rear == null) // Queue empty?
        {
            front = new Node<E>(element, null);
            rear = front;
        } else {
            rear.setNext(new Node<E>(element, null));
            rear = rear.getNext();
        }
        numElements++;
    }

    /**
     * remove method remove the value from the front of the queue
     * @return element in front from the queue
     * @throws EmptyQueue if queue is empty
     */
    public E remove() throws EmptyQueue {
        E value;
        if (front == null) // Queue empty?
        {
            throw new EmptyQueue();
        } else {
            value = front.getData();
            if (front != rear) {
                front = front.getNext();
            } else // removing last node
            {
                front = null;
                rear = null;
            }
            numElements--;
        }
        return value;
    }

    /**
     * size returns size of the queue
     *
     * @return the number of elements in the queue
     */
    public int size() {
        return numElements;
    }
}
