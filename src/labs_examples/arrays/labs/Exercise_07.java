package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {
        ArrayList <String> students = new ArrayList<String>();
        students.add("Joe");
        students.add("Jane");
        students.add("Jill");
        students.add("Jim");
        students.add("Jenny");

        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }

        //Finding the ArrayList length
        System.out.println(students.size());

        //Adding an element to the ArrayList
        students.add("Jeff");

        //Removing an element from the ArrayList
        students.remove("Jill");

        //Removing an element from the ArrayList by index
        students.remove(2);

        //Removing all elements from the ArrayList
        students.clear();

        //Checking if the ArrayList is empty
        System.out.println(students.isEmpty());

        //Checking if the ArrayList contains a specific element
        System.out.println(students.contains("Joe"));




    }
}
