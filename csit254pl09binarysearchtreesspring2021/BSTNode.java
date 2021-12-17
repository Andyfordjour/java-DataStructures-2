package csit254pl09binarysearchtreesspring2021;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Andy Fordjour
 */

public class BSTNode<E> {

    private E data;
    private BSTNode<E> right;
    private BSTNode<E> left;

    /**
     * constructor
     *
     * @param initialData the value for the data field
     * @param initialRight the value for the right field
     * @param initialLeft the value for the left field
     */
    public BSTNode(E initialData, BSTNode<E> initialLeft, BSTNode<E> initialRight) {
        data = initialData;
        right = initialRight;
        left = initialLeft;

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
     * getRight method returns the value from the return field
     *
     * @return value from the right field
     */
    public BSTNode<E> getRight() {
        return right;
    }

    /**
     * getLeft method returns the value from the left field
     *
     * @return value from the left field
     */
    public BSTNode<E> getLeft() {
        return left;
    }

    /**
     * getRightmostData method returns the value from the right most data
     *
     * @return values from the right data
     */
    public E getRightmostData() {
        if (right == null) {
            return data;
        } else {
            return right.getRightmostData();
        }
    }

    /**
     * inorderPrint method prints the values in order
     */
    public void inorderPrint() {
        if (left != null) {
            left.inorderPrint();
        }

        System.out.println(data);

        if (right != null) {
            right.inorderPrint();
        }
    }

    /**
     * removeRightmost method removes the rightmost field from the tree
     * @return the value removed
     */
    public BSTNode<E> removeRightmost() {
        if (right == null) //the rightmost is at the root because there is no right child 
        {
            return left;
        } else {
            //A recursive call removes the rightmost node from my own right child
            right = right.removeRightmost();
            return this;
        }

    }

    /**
     * setData assigns a newData to the data field
     *
     * @param newData new value for the data field
     */
    public void setData(E newData) {
        data = newData;
    }

    /**
     * setRight assigns a newRight to the data field
     *
     * @param newRight new value for the Right field
     */
    public void setRight(BSTNode<E> newRight) {
        right = newRight;
    }

    /**
     * setLeft assigns a newLeft to the right field
     *
     * @param newLeft new value for the Left field
     */
    public void setLeft(BSTNode<E> newLeft) {
        left = newLeft;
    }

}


