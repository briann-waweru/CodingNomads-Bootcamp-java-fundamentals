package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int strLength = str.length();

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean isEqual =str.equals(str);
        System.out.println("Is String " +str+ " equal to String " +str2 + "? " + isEqual);

        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = (str +  str2);
        System.out.println("Concatinating String " + str + " with String " +str2 + " we get String : " + str3);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        //indexOf() method
        int strindex = str.indexOf('o');
        System.out.println("The index of o  in string " + str + " is : " + strindex);

        //substring() method
        String substr = str.substring(1, 3);
        System.out.println("Substring of string "+ str + " is : " + substr);

        //contains() method
        boolean containsChar = str.contains("l");
        System.out.println("String " + str + " contains l : " + containsChar);

    // replace() method
        String str2Replaced = str2.replace("Hello", "Hello world!");


    }


}
