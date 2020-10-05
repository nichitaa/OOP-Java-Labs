package com.company;

/*
*
*  Pasecinic Nichita
*  Lab 3 OOP
*  FAF-192
*  05.10.2020
*
* */

public class Main {

    public static void main(String[] args) {
        String text =
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. " +
                "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        
        StringManipulator manipulator = new StringManipulator(text);

        // task 1:
        System.out.println("Number of sentences in the text  -> " + manipulator.NumberOfSentences());
        System.out.println("Number of words in the text      -> " + manipulator.NumberOfWords());

        // task 2:
        System.out.println("Number of letters in the text    -> " + manipulator.NumberOfLetters());
        System.out.println("Number of vowels in the text     -> " + manipulator.NumberOfVowels());
        System.out.println("Number of consonants in the text -> " + manipulator.NumberOfConsonants());

        // task 3:
        System.out.println("Longest word in the text         -> " +  manipulator.LongestWord() + "\n");
        manipulator.MostUsedWords();

    }
}
