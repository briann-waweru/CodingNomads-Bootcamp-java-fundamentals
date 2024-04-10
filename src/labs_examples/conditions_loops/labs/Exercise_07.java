package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask the user to input a word
        System.out.println("Enter a word: ");
        //Convert the word to lowercase
        String word = scanner.nextLine().toLowerCase();

        //String containing all the vowels
        String vowels = "aeiou";

        //Initialize Index and Found flag
        int index = 0;
        boolean found = false;

        //While loop to find the first vowel
        while(index < word.length() && !found){
            char currentChar = word.charAt(index);

            //Check if the current character the current character is a vowel
            if(vowels.indexOf(currentChar) != -1){
                found = true;
                System.out.println("Word: " + word);
                System.out.println("First vowel: " + currentChar);
            }
            index++; //Move to the next character
        }

        //If no vowel is found
        if (!found) {

            System.out.println("No vowels found");
        }
        scanner.close();

    }



    }
















