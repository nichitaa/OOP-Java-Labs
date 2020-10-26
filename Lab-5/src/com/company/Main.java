// Pasecinic Nichita
// FAF - 192


package com.company;

public class Main {

    public static void main(String[] args) {
        A letterA = new A("a", new X("some name"));
        B letterB = new B(letterA, "b");
        C letterC = new C(letterA, letterB, "c");
        D letterD = new D(letterA, letterB, letterC, "d");
        E letterE = new E(letterA, letterB, letterC, letterD, "e");
        F letterF = new F(letterA, letterB, letterC, letterD, letterE, "f");
        G letterG = new G(letterA, letterB, letterC, letterD, letterE, letterF, "g");
        H letterH = new H(letterA, letterB, letterC, letterD, letterE, letterF, letterG, "h");
        I letterI = new I(letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, "i");
        J letterJ = new J(letterA, letterB, letterC, letterD, letterE, letterF, letterG, letterH, letterI, "j");


        // task 1:
        System.out.print("B class object -> ");
        letterB.getInstances();System.out.println();

        System.out.print("C class object -> ");
        letterC.getInstances();System.out.println();

        System.out.print("D class object -> ");
        letterD.getInstances();System.out.println();

        System.out.print("E class object -> ");
        letterE.getInstances();System.out.println();

        System.out.print("F class object -> ");
        letterF.getInstances();System.out.println();

        System.out.print("G class object -> ");
        letterG.getInstances();System.out.println();

        System.out.print("H class object -> ");
        letterH.getInstances();System.out.println();

        System.out.print("I class object -> ");
        letterI.getInstances();System.out.println();

        System.out.print("J class object -> ");
        letterJ.getInstances();System.out.println();
//        Output:
//        B class object -> a b
//        C class object -> a b c
//        D class object -> a b c d
//        E class object -> a b c d e
//        F class object -> a b c d e f
//        G class object -> a b c d e f g
//        H class object -> a b c d e f g h
//        I class object -> a b c d e f g h i
//        J class object -> a b c d e f g h i j
//
//        Process finished with exit code 0


        // task 2:
//        System.out.println("\nObject of type J can now access the x attribute of type X from the class A: ");
//        System.out.println("object x from class A accessed by letterJ: " + letterJ.x + "\n");
        // Output with x property public or protected for the above class:
//        Object of type J can now access the x attribute of type X from the class A:
//        object x from class A accessed by letterJ: com.company.X@16d3586

        // task 3:
        // * -> if I am changing the default value for x in class A, as my constructor in class A takes as parameter
        // a object of a X class and sets this.x = passed object (so the value for x is being updated by the passed parameter)
        // ** -> if I am changing the default value for x in a higher hierarchy class, then the value is for x is going to be updated
        // with the default value passed from the higher hierarchy class.
//        System.out.println("Initial value for x in class A accessed by a object of class J: " + letterJ.x.name);
        // Output for the above line, with the default value for x in H class:
//        Initial value for x in class A accessed by a object of class J: xxx-change-in-H
        // NOTE: the name property here is public/protected

        // *** -> if the x property from class H is set to private then we need a getter function to get the x.name value and print it
        System.out.print("Get the x.name value from letterJ: ");
        letterJ.printXname();
        // Output:
        // Get the x.name value from letterJ: xxx-change-in-H
        // NOTE: in class H exists a default value for x and this is why the value has been updated



    }
}
