import java.util.Scanner;

/*Sum of Odd Elements:

Task: Write a Java program to calculate the sum of all odd numbers in an integer array.
Sample Input: [1, 2, 3, 4, 5, 6, 7, 8]
Sample Output: Sum of odd elements = 16
*/
public class Task_15 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int[] arr=new int[8];
        System.out.println("Sample Input:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=keyboard.nextInt();
            
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                sum+=arr[i];
            }
            
        }
        System.out.println("sum = " + sum);
    }
}
