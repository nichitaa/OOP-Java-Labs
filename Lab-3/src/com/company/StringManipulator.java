package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulator {
    String text; // our String text to work with

    // constructor
    public StringManipulator(String text) {
        this.text = text;
    }

    // return number of sentences in the text
    public int NumberOfSentences() {
        // pattern for ending of a sentence -> "punctuationMark(.!?) + white space or end of line + upper case letter"
        String pattern = "(([.!?])([\\s\\n])([A-Z]*))";

        // pattern object
        Pattern p = Pattern.compile(pattern);

        // matcher object
        Matcher m = p.matcher(this.text);

        int c = 0; // counter
        while (m.find()) { // update counter if matcher finds the pattern
            c++;
        }
        c++; // for the last sentence as it will not correspond to the pattern
        return c;
    }

    // return number of words from the text
    public int NumberOfWords() {
        // words are separated by spaces, so just split the text by spaces, and return the new array length
        String[]w = this.text.split("\\s+");
        return w.length;
    }

    // return number of letters form the text
    public int NumberOfLetters() {
        char ch;
        int c = 0; // letters counter
        for (int i=0; i<this.text.length(); i++) {
            ch = this.text.charAt(i); // extract a charter from the text string
            if (Character.isLetter(ch)) { // check if current charter is a letter
                c++; // update counter
            }
        }
        return c; // return counter
    }

    // return number of vowels form the text
    public int NumberOfVowels() {
        int v = 0; // counter
        String vowels = "aeiouAEIOU"; // string with vowels (lower and upper case)
        char ch;

        for (int i=0; i<this.text.length(); i++) { // iterate over the original text
            ch = this.text.charAt(i); // extract a character at current index
            if (vowels.contains(Character.toString(ch))) { // if the character is present in the vowels string
                v++; // update counter
            }
        }
        return v;
    }

    // return number of consonants
    public int NumberOfConsonants() {
        int c = 0;
        String consonants = "bcdfghjklmnpqrstvwxzyBCDFGHJKLMNPQRSTVWXZY"; // string with all consonants
        char ch;
        for (int i=0; i<this.text.length(); i++) {
            ch = this.text.charAt(i);
            if (consonants.contains(Character.toString(ch))) {
                c++;
            }
        }
        return c;
    }

    // return longest word in the text
    public String LongestWord() {
        String longestWord = ""; // longest word variable
        int MaxlenWord = 0; // it's length
        int CurrentLen = 0;
        String [] words = this.text.split("\\W+"); // get all words from the text

        for (int i=0; i<words.length; i++) { // iterate over the words
            CurrentLen = words[i].length(); // get the words[i] and find it's length
            // check if the current length is greater then maxLength
            if (CurrentLen > MaxlenWord) {
                MaxlenWord = CurrentLen; // update maxLength
                longestWord = words[i];  // update LongestWord
            }
        }
        return longestWord;
    }

    // return first 5 most often used words in text
    public void MostUsedWords() {
        // string array with all words
        String [] words = this.text.split("\\W+");
        // hash map to store the frequency of each word in the text -> "word" = nrOfOccurrence
        LinkedHashMap<String, Integer> wordFreq = new LinkedHashMap();

        int c = 1; // counter for word occurrence

        // iterate twice in the words array and compare each word with all items from array
        for (int i=0; i<words.length; i++) {
            for (int j=0; j<words.length; j++) {
                if (words[i].equals(words[j]) && i!=j) { // if the words are similar and are not at the same index => wordOccurrence++
                    c++;
                }
            }
            // add pair (word: occurrence) to the map
            wordFreq.put(words[i], c);
            c=1; // reset counter
        }

        //get all entries from the LinkedHashMap and convert it to a List
        List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>( wordFreq.entrySet() );

        // sort the list in descending order
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry2.getValue() - entry1.getValue();
            }
        });

        // print first 5 elements form the list
        System.out.println("Top 5 word in text:");
        for (int i=0; i<5; i++) {
            System.out.println("Word: " + entries.get(i).getKey() + " Occurrence -> " + entries.get(i).getValue() );
        }
    }

}
