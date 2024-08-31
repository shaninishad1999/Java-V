import java.util.Scanner;
/*
3 Write a program to accept numbers from user and handle all the possible unchecked exception that can occur.

 */
public class UncheckedExceptionDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        try {
            System.out.println("Enter First Number");
            int num1 = keyboard.nextInt();
            System.out.println("Enter Second Number");
            int num2 = keyboard.nextInt();

            // Perform division to demonstrate unchecked exception handling
            int result = num1 / num2;
            System.out.println("Result of division: " + result);

            // Access an array element to demonstrate ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element at index 3: " + numbers[3]);
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException occurred: Please enter a valid integer.");
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occurred: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Close the scanner to free resources
            keyboard.close();
            System.out.println("Scanner closed.");
        }
    }
}
