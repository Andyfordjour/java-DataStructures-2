package csit254pl09binarysearchtreesspring2021;

/**
 * Purpose: To Test remove() method - condition 1 - cursor is null -
 *    target not found
 * meaning: attempt to remove value not in tree
 * @author Stephen T. Brower
 */
public class LabForCh09BTestRemoveCondition1 {

    public static void main(String args[]) {
        Tree<Car> myTree = new Tree<Car>();
        Car valueToRemove = new Car(2020, "Cruz");
        boolean debug = true;
        int sizeBeforeAction = 6, sizeAfterAction = 6;

        System.out.println("========Test Condition 1 - not there");

        myTree.add(new Car(2020, "Explorer"));
        myTree.add(new Car(2020, "Dodge"));
        myTree.add(new Car(2020, "Malibu"));
        myTree.add(new Car(2020, "Aero"));
        myTree.add(new Car(2020, "Edsel"));
        myTree.add(new Car(2020, "Avalon"));

        System.out.print("Tree before removal (Size == " + myTree.size() + ")");
        if (myTree.size() == sizeBeforeAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
        }

        myTree.printTree();

        // attempt to remove valueToRemove
        if (myTree.remove(valueToRemove)) {
            System.out.println("\n" + valueToRemove + " removed <<---Issue");
        } else {
            System.out.println("\n" + valueToRemove + " not removed");
        }

        System.out.print("Tree After removal (Size == " + myTree.size() + ")");
        if (myTree.size() == sizeAfterAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
        }

        myTree.printTree();

        System.out.println("\n^^^ please visually compare output(above) "+
                "with expected output (in comments below)");


    }
}

/* output should be:

========Test Condition 1 - not there
Tree before removal (Size == 6)-Yes
[Car 2020 Aero]
[Car 2020 Avalon]
[Car 2020 Dodge]
[Car 2020 Edsel]
[Car 2020 Explorer]
[Car 2020 Malibu]

[Car 2020 Cruz] not removed
Tree After removal (Size == 6)-Yes
[Car 2020 Aero]
[Car 2020 Avalon]
[Car 2020 Dodge]
[Car 2020 Edsel]
[Car 2020 Explorer]
[Car 2020 Malibu]

^^^ please visually compare output(above) with expected output (in comments below)

*/
