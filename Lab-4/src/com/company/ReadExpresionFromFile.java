package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadExpresionFromFile {

    // method to return one expresion from file
    public static String read(String fileName) throws IOException {
        BufferedReader reader = null;
        String expression = ""; // string to store the expresion
        try{
            // instantiate o BufferReader object with a FileReader object as parameter containing the file name
            reader = new BufferedReader(new FileReader(fileName));
            // read the first line
            expression = reader.readLine();

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            // close the file
            reader.close();
        }
        // return the expresion
        return expression;
    }

    // method to read multiple expressions from a file
    public static ArrayList<String> readMultipleExpressions(String fileName) throws FileNotFoundException {

        // new array list to store all expressions
        ArrayList<String> list = new ArrayList<String>();
        // scanner object to scan thru the file lines
        Scanner file_scanner = new Scanner(new File(fileName));

        // iterating over each line of the file_scanner
        while(file_scanner.hasNextLine()) {
            list.add(file_scanner.nextLine()); // add the line to list of expressions
        }
        // return the array list
        return list;
    }

}
