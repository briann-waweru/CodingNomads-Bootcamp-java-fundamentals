package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("_____________________Printing an Array in forward order_____________________");

        //Printing an array in forwardrd order
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("_____________________Printing an Array in reverse order_____________________");

        //Printing an array in reverse order
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.println(array[j]);
        }
    }



}
