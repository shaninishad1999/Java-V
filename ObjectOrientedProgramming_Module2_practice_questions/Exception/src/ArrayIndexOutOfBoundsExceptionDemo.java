/*
 * 2 Write a program to demonstrate exception handling for ArrayIndexOutOfBoundsException,
 * using command line arguments.
 */

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to access the first command line argument
            String argument = args[0];
            System.out.println("First command line argument: " + argument);
        } catch (ArrayIndexOutOfBoundsException ae) {
            // Handle the exception if no command line arguments are provided
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println("Error Message: " + ae.getMessage());
            ae.printStackTrace();
        }
    }
}
