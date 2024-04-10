package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            System.out.println("i = " + i);
            i++;
            if (i == 5) {
                break;
            }
        }

        int count = 0;

        while (count < 50) {

            System.out.println("count = " + count);
            count++;

            if (count == 43){
                break;
            }
        }



    }
}
