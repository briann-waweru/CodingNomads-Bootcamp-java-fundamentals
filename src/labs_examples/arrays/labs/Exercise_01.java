package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");


        //Store the numbers in an array
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        //Calculate the sum of all the numbers in the array
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        //Calculate the average of all the numbers in the array
        double average = sum / array.length;

        //Print the results to the console
        System.out.println("The sum of all the numbers in the array is: " + sum);
        System.out.println("The average of all the numbers in the array is: " + average);
    }

}