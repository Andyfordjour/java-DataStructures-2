package csit254pl09binarysearchtreesspring2021;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Andy Fordjour
 */

public class Tree<E extends Comparable<E>> {
//  private BSTNode<E> root;

    private BSTNode<E> root;
    private int numItems;

    /**
     * no-arg constructor
     */
    public Tree() {
        root = null;
        numItems = 0;
    }

    /**
     * add method adds a value to the tree
     *
     * @param element the value to be added to the tree
     */
    public void add(E element) {
        if (root == null) {
            root = new BSTNode<E>(element, null, null);
        } else {
            BSTNode<E> cursor = root;
            boolean done = false;
            while (!done) {
                if (element.compareTo(cursor.getData()) <= 0) {
                    if (cursor.getLeft() == null) {
                        cursor.setLeft(new BSTNode<E>(element, null, null));
                        done = true;
                    } else {
                        cursor = cursor.getLeft();
                    }
                } else {
                    if (cursor.getRight() == null) {
                        cursor.setRight(new BSTNode<E>(element, null, null));
                        done = true;
                    } else {
                        cursor = cursor.getRight();

                    }

                }

            }

        }
        numItems++;
    }

    /**
     * exist method looks for the value in the bag
     *
     * @param target the value to be found in the bag
     * @return a Boolean to indicate if the value is found in the bag
     */
    public boolean exists(E target) {
        BSTNode<E> cursor = root;
        boolean found = false;

        while (!found && cursor != null) {
            if (cursor.getData().compareTo(target) == 0) {
                found = true;
            } else if (cursor.getData().compareTo(target) > 0) {
                cursor = cursor.getLeft();
            } else {
                cursor = cursor.getRight();
            }
        }
        return found;
    }

    /**
     * remove method looks for the first occurrence of a value in the list and
     * remove it
     *
     * @param target the value to be removed from the bag
     * @return a Boolean to indicate if the target is found
     */
    public boolean remove(E target) {
        boolean found = false;
        BSTNode<E> cursor = root;
        BSTNode<E> parentOfCursor = null;
        while (cursor != null && !found) {
            if (cursor.getData().compareTo(target) == 0) {
                found = true;
                numItems--;
            } else {
                parentOfCursor = cursor;
                // cursor = cursor.getLeft() || cursor.getRight();

                // if  (target <=cursor.getData())
                if (target.compareTo(cursor.getData()) <= 0) {
                    cursor = cursor.getLeft();
                } else {
                    cursor = cursor.getRight();
                }
            }
        }
        if (cursor == null) {
            found = false;
        } else if (cursor == root && cursor.getLeft() == null) {
            root = root.getRight();
        } else if (cursor != root && cursor.getLeft() == null) {
            if (cursor == parentOfCursor.getLeft()) {
                parentOfCursor.setLeft(cursor.getRight());
            } else {
                parentOfCursor.setRight(cursor.getRight());
            }
        } else {
            cursor.setData(cursor.getLeft().getRightmostData());
            cursor.setLeft(cursor.getLeft().removeRightmost());

        }
        return found;

    }

    /**
     * Size method returns the tree current size
     *
     * @return returns the number of values in the bag
     */
    public int size() {
        return numItems;
    }

    /**
     * in orderPrint method prints the tree in order
     */
    public void printTree() {
        if (root != null) {
            root.inorderPrint();
        }

    }
}