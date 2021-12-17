package csit254proglabch04bstringlinkedbags21;

/**
 *                  use your StringNode from prior the lab (4A)
 * @author Andy Fordjour
 */
public class StringNode {
 
      private String data;
    private StringNode next;

    /**
     * constructor
     * @param initialData value for the data field
     * @param initialNext value for the next field
     */
    public StringNode(String initialData, StringNode initialNext) {
        data = initialData;
        next = initialNext;
    }

    /**
     * getData method returns the value from the data field
     *
     * @return value from the data field
     */
    public String getData() {
        return data;
    }

    /**
     * getNext method returns the value from the next field
     *
     * @return value from the next field
     */
    public StringNode getNext() {
        return next;
    }

    /**
     * setData assigns a new value for data field
     *
     * @param initialData new value for the data field
     */
    public void setData(String initialData) {
        data = initialData;
    }

    /**
     * setNext assigns a new value for next field
     *
     * @param initialNext new value for the next field
     */
    public void setNext(StringNode initialNext) {
        next = initialNext;
    }

}


