package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    // function to show if the expresion is valid or not
    static void validate(String mathExp) {
        // calling the isValidExpresion method from ParenthesesValidator class
        // and passing as parameter our expresion (string format)
        if (ParenthesesValidator.isValidExpresion(mathExp)) {
            System.out.println("Status: VALID math expresion! ✔✔✔\n");
        } else {
            System.out.println("Status: INVALID math expresion! ✘✘✘\n");
        }
    }

    public static void main(String[] args) throws IOException {

        // task 1
        String e = "(1+1) 1+ 1 + { (1/1) + ( 1 + [ 1* { 1 } / 1] + 1) }";
        System.out.println("Validating a hardcoded expresion:");
        System.out.println("Expresion: " + e);
        validate(e); // show result


        // task 2
        // Creating a String exp, to store the expresion from file, returned by our read method from ReadExpressionFromFile class
        // passing as parameter the file name
        String exp = ReadExpresionFromFile.read("one_expresion.txt");
        System.out.println("Reading singular expresion from a txt file:");
        System.out.println("Expresion form file: " + exp);
        validate(exp); // show result


        // task 3
        // Creating an ArrayList<String> object to store each expresion from our file
        // by calling readMultipleExpressions method from ReadExpresionFromFile class and passing again the file name with expressions
        ArrayList<String> expressions = ReadExpresionFromFile.readMultipleExpressions("multiple_expressions.txt");
        String currentExpression = ""; // String variable to store each expresion
        System.out.println("Reading multiple expressions from a txt file:");
        // iterate over list with expressions
        for (int i = 0; i < expressions.size(); i++) {
            currentExpression = expressions.get(i); // update the current expresion
            System.out.format("Expresion %d: %s\n", i+1, currentExpression); // print it on console
            validate(currentExpression); // show result
        }
    }
}

//        OUTPUT:
//
//        Validating a hardcoded expresion:
//        Expresion: (1+1) 1+ 1 + { (1/1) + ( 1 + [ 1* { 1 } / 1] + 1) }
//        Status: VALID math expresion! ✔✔✔
//
//        Reading singular expresion from a txt file:
//        Expresion form file: 2 * 4 + (3 +6 * 9 -    12 * (2*9 - 15))  + 2 +(-4)*((2 - 15))
//        Status: VALID math expresion! ✔✔✔
//
//        Reading multiple expressions from a txt file:
//        Expresion 1: 1. 2x - 3y + 25 / (2+5)*12 - ((29*4-2) + 32) -14
//        Status: VALID math expresion! ✔✔✔
//
//        Expresion 2: 2. 2x - 3y + 25 / (-((29*4-2) + 32) -14 - (2+5)*12
//        Status: INVALID math expresion! ✘✘✘
//
//        Expresion 3: 3. ((((((((((((((((((((2x-4y * 98 )))))))))))))))))))))
//        Status: INVALID math expresion! ✘✘✘