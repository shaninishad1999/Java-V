import java.util.Scanner;

/*Check for Duplicates:

Task: Write a program to check if there are any duplicate elements in an integer array.
Sample Input: [7, 3, 9, 2, 3, 8]
Sample Output: Duplicate found: 3*/
public class Task_14 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int[] arr=new int[6];
        System.out.println("Sample Input:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=keyboard.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {

            if (arr[i]==arr[j]){
                System.out.println("Dublicate Array = " + arr[i]);
            }
            }

        }
    }
}
