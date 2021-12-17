package csit254pl09binarysearchtreesspring2021;

/**
 * Purpose To Test remove() method when tree is empty
 *
 * @author Stephen T. Brower
 */
public class LabForCh09BTestRemoveCondition0EmptyTree {

    public static void main(String args[]) {
        Tree<Car> myTree = new Tree<Car>();
        Car valueToRemove = new Car(2020, "Explorer");
        boolean debug = true;
        int sizeBeforeAction = 0, sizeAfterAction = 0;

        System.out.println("========Test Condition 0 - tree is empty");

        System.out.print("Tree before removal (Size == " + myTree.size() + ")");
        if (myTree.size() == sizeBeforeAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
        }

        myTree.printTree();

        // attempt to remove valueToRemove
        if (myTree.remove(valueToRemove)) {
            System.out.println(" " + valueToRemove + " removed <<---Issue");
        } else {
            System.out.println(" " + valueToRemove + " not removed");
        }

        System.out.print("Tree After removal (Size == " + myTree.size() + ")");
        if (myTree.size() == sizeAfterAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
        }

        myTree.printTree();

        System.out.println("\n^^^ please visually compare output(above) "
                + "with expected output (in comments below)");

    }
}
/* output should be:

========Test Condition 0 - tree is empty
Tree before removal (Size == 0)-Yes
empty
 [Car 2020 Explorer] not removed
Tree After removal (Size == 0)-Yes
empty

^^^ please visually compare output(above) with expected output (in comments below)


 */
