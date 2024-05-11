package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double radius = 3.14;
        double height = 5;
        double volume = radius * radius * height * 3.14;
        double surfaceArea = 2 * radius * radius * 3.14 + 2 * radius * height * 3.14;

        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);

    }
}