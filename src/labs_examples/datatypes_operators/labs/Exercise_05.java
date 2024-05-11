package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        // example of "OR"
        boolean x = true;
        boolean y = false;


        // Example of "AND"
        if (x & y) {
            System.out.println("a and b are both true");
        }

        // Example of "short-circuit OR"
        if (x || y) {
            System.out.println("a or b is true");
        }

        // Example of "short-circuit AND"
        if (x && y) {
            System.out.println("a and b are both true");
        }

        // Example of "XOR"
        if (x ^ y) {
            System.out.println("a or b, but not both, is true");
        }

        // Example of "NOT"
        if (!x) {
            System.out.println("a is not true");
        }


    }

}

