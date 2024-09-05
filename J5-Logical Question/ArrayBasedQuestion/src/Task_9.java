/*Sum of Even Elements:

Task: Write a Java program to find the sum of all even numbers in an integer array.
Sample Input: [1, 2, 3, 4, 5, 6, 7, 8]
Sample Output: Sum of even elements = 20*/
public class Task_9 {
    public static void main(String[] args) {
       int[] arr={1, 2, 3, 4, 5, 6, 7, 8};

       int sum=0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]%2==0){
                sum+=arr[i];
            }

        }
        System.out.println("sum of even Number = " + sum);
    }
}
