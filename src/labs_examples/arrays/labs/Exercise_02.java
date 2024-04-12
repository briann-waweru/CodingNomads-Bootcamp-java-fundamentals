package labs_examples.arrays.labs;

import java.util.Scanner;



/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // Initialize and populate the array with numbers 1 to 10
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 - i; // This will fill the array with numbers 10 to 1
        }

        // Prompt the user for a number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int numbers = scanner.nextInt();

        // Find and print the index of the number in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numbers) {


                System.out.println("Index of " + numbers + " is " + i);
            }
        }
    }
}