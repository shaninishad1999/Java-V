/*Sum of Array Elements:

Task: Write a program to calculate the sum of all elements in an integer array of size 10.
Sample Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Sample Output: Sum = 55*/
public class Task_2 {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            
        }
        System.out.println("sum = " + sum);
    }
}
