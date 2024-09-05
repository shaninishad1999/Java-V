/*Array of Floating-point Numbers:

Task: Create a float array of size 4, initialize it with values, and write a program to print the array.
Sample Input: [1.1f, 2.2f, 3.3f, 4.4f]
Sample Output: [1.1, 2.2, 3.3, 4.4]*/
import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float[] arr = new float[4];

        System.out.println("Sample Input:");
        // Reading input from user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = keyboard.nextFloat();
        }

        // Print array in the desired format
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
