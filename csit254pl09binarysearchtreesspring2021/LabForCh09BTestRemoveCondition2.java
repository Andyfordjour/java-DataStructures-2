package csit254pl09binarysearchtreesspring2021;

/**
 *
 * Purpose To Test remove() method - condition 2 node to be removed is at root
 * and no left child
 *
 * @author Stephen T. Brower
 */
public class LabForCh09BTestRemoveCondition2 {

    public static void main(String args[]) {
        Tree<Car> myTree = new Tree<Car>();
        Car valueToRemove = new Car(2020, "Dodge");
        boolean debug = true;
        int sizeBeforeAction = 4, sizeAfterAction = 3;

        System.out.println("========Test Condition 2 - at root, no left");

        myTree.add(new Car(2020, "Dodge"));
        myTree.add(new Car(2020, "Explorer"));
        myTree.add(new Car(2020, "Malibu"));
        myTree.add(new Car(2020, "Edsel"));

        System.out.print("Tree before removal (Size == " + myTree.size() + ")");
        if (myTree.size() == sizeBeforeAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
        }

        myTree.printTree();

        // attempt to remove valueToRemove
        if (myTree.remove(valueToRemove)) {
            System.out.println("\n" + valueToRemove + " removed");
        } else {
            System.out.println("\n" + valueToRemove + " not removed <<---Issue");
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

========Test Condition 2 - at root, no left
Tree before removal (Size == 4)-Yes
[Car 2020 Dodge]
[Car 2020 Edsel]
[Car 2020 Explorer]
[Car 2020 Malibu]

[Car 2020 Dodge] removed
Tree After removal (Size == 3)-Yes
[Car 2020 Edsel]
[Car 2020 Explorer]
[Car 2020 Malibu]

^^^ please visually compare output(above) with expected output (in comments below)

 */
