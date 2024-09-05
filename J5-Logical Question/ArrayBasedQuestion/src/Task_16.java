import java.util.Scanner;

/*Replace Elements in an Array:

Task: Write a program to replace all occurrences of a specific integer in an array with another integer.
Sample Input: Array: [4, 5, 6, 4, 7], Replace 4 with 9
Sample Output: [9, 5, 6, 9, 7]
*/
public class Task_16 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Sample Input");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=keyboard.nextInt();

        }
        int k=4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==k){
                arr[i]=9;
            }

            System.out.print(arr[i]);
            if (i< arr.length-1){
                System.out.print(", ");
            }
        }
    }
}
