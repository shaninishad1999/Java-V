import java.util.Scanner;

/*
 * Program to print a given string character by character
 * and handle StringIndexOutOfBoundsException.
 */

public class StringCharacterPrinter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        try {
            // Prompt the user to enter a string
            System.out.print("Enter a string: ");
            String str = keyboard.nextLine();

            // Print each character of the string
            for (int i = 0; i <= str.length(); i++) {
                System.out.println("Character at index " + i + ": " + str.charAt(i));
            }
        } catch (StringIndexOutOfBoundsException sibe) {
            // Handle case where the index is out of bounds
            System.out.println("StringIndexOutOfBoundsException occurred: Attempted to access index outside the string length.");
        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Close the scanner to free resources
            keyboard.close();
            System.out.println("Scanner closed.");
        }
    }
}
