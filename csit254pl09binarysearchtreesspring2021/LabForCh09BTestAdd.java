package csit254pl09binarysearchtreesspring2021;

/**
 * Tester for LabForCh09 - test of add()
 * @author Stephen T. Brower
 */
public class LabForCh09BTestAdd {
    public static void main(String args[])
    {
        Tree<Car> myTree = new Tree<Car>();
        int sizeBeforeAction = 0, sizeAfterAction = 7;

        System.out.println("========Simple Tester - Test add()");

        System.out.print("Tree before adds (Size == " + myTree.size() + ")");
        if (myTree.size() == sizeBeforeAction) {
            System.out.println("-Yes");
        } else {
            System.out.println("<<----ISSUE------");
        }

        myTree.add(new Car(2020,"Edsel"));
        myTree.add(new Car(2020,"Dodge"));
        myTree.add(new Car(2020,"Malibu"));
        myTree.add(new Car(2020,"Explorer"));
        myTree.add(new Car(2020,"Aero"));
        myTree.add(new Car(2020,"Camaro"));
        myTree.add(new Car(2020,"Neon"));

        System.out.print("Tree after 7 adds (Size == "+myTree.size()+")");
        if (myTree.size() ==  sizeAfterAction)
            System.out.println("-Yes");
        else
            System.out.println("<<----ISSUE------");

        myTree.printTree();

        System.out.println("\n^^^ please visually compare output(above) "+
                "with expected output (in comments below)");
    }
}
/*
Expected Output:

========Simple Tester - Test add()
Tree before adds (Size == 0)-Yes
Tree after 7 adds (Size == 7)-Yes
[Car 2020 Aero]
[Car 2020 Camaro]
[Car 2020 Dodge]
[Car 2020 Edsel]
[Car 2020 Explorer]
[Car 2020 Malibu]
[Car 2020 Neon]

^^^ please visually compare output(above) with expected output (in comments below)

*/
