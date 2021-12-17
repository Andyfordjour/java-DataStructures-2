/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_04;

/**
 *
 * @author fordjour andy
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
