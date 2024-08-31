/* 5 Write a program to print ASCII values of Character objects using wrapper class.
 */
public class CharacterASCIIValues {
    public static void main(String[] args) {
        // Create Character objects
        Character char1 = 'A';
        Character char2 = 'b';
        Character char3 = '1';
        Character char4 = '@';
        Character char5 = ' ';

        // Print ASCII values of Character objects
        printASCIIValue(char1);
        printASCIIValue(char2);
        printASCIIValue(char3);
        printASCIIValue(char4);
        printASCIIValue(char5);
    }

    // Method to print the ASCII value of a Character object
    public static void printASCIIValue(Character ch) {
        // Convert Character to char and then to int to get ASCII value
        int asciiValue = (int) ch.charValue();
        System.out.println("Character: " + ch + " | ASCII Value: " + asciiValue);
    }
}

