import java.util.Scanner;

/*Find the Smallest Positive Number:

Task: Given an integer array, write a program to find the smallest positive number in the array.
Sample Input: [12, -5, 0, 8, 3]
Sample Output: Smallest positive number = 3*/
public class Task_17 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Sample Input:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = keyboard.nextInt();
        }
        int p = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] < p) {
                    p = arr[i];
                }
            }
        }
        System.out.println("p = " + p);

    }
}
