/*
5 Write a program to handle ClassCastException, by doing explicit casting of Object to Integer.*/

public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        Object obj = "This is a string, not an integer"; // Assigning a String object

        try {
            // Attempting to cast an Object to Integer explicitly
            Integer num = (Integer) obj;
            System.out.println("The number is: " + num);
        } catch (ClassCastException cce) {
            // Handling ClassCastException
            System.out.println("ClassCastException occurred: Cannot cast a String object to Integer.");
            System.out.println("Error Message: " + cce.getMessage());
        } catch (Exception e) {
            // Handling any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

