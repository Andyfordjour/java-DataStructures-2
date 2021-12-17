package csit254pl09binarysearchtreesspring2021;

/**
 * Tester for LabForCh09 - test of exists()
 * @author Stephen T. Brower
 */
public class LabForCh09BTestExists {
    public static void main(String args[])
    {
        Car carToFind = new Car(2020,"Aero");
        Car carToNotFind = new Car(2020,"Air head");

        Tree<Car> myTree = new Tree<Car>();
        int sizeBeforeAction = 0, sizeAfterAction = 7;

        System.out.println("========Simple Tester - Test exists()");

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


        System.out.println();
        if (myTree.exists(carToFind))
            System.out.println(carToFind + " exists -- good");
        else
            System.out.println(carToFind + " does not exist -- issue");


        System.out.println();
        if (myTree.exists(carToNotFind))
            System.out.println(carToNotFind + " exists -- issue");

        else
            System.out.println(carToNotFind + " does not exist -- good");

        System.out.print("\nTree after 2 searches (Size == "+myTree.size()+")");

        if (myTree.size() ==  sizeAfterAction)
            System.out.println("-Yes");
        else
            System.out.println("<<----ISSUE------");

        System.out.println("\n^^^ please visually compare output(above) "+
                "with expected output (in comments below)");
    }
}
/*
Expected Output:

========Simple Tester - Test exists()
Tree before adds (Size == 0)-Yes
Tree after 7 adds (Size == 7)-Yes
[Car 2020 Aero]
[Car 2020 Camaro]
[Car 2020 Dodge]
[Car 2020 Edsel]
[Car 2020 Explorer]
[Car 2020 Malibu]
[Car 2020 Neon]

[Car 2020 Aero] exists -- good

[Car 2020 Air head] does not exist -- good

Tree after 2 searches (Size == 7)-Yes

^^^ please visually compare output(above) with expected output (in comments below)



*/
