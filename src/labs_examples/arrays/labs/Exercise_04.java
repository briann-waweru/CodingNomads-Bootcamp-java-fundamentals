package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        //Step 1: Create and populate a 2 D with irreular sizes
        int [] [] irregularArray = {
                {1,2,3},
                {4,5},
                {6,7,8,9},
                {10},
                {11,12,13,14,15}
        };

        //Step 2: Iterate and print out each element of the array using a nested "for-each" loop
        for(int [] innerArray: irregularArray){
            for(int element: innerArray){
                System.out.print(element + " ");
            }

            //Move to the next line after printing each inner array
            System.out.println();
        }

    }

}
