/*Find Second Largest Element:

Task: Write a program to find the second-largest element in an integer array.
Sample Input: [15, 22, 8, 19, 31]
Sample Output: Second Largest Element = 22*/
public class Task_11 {
    public static void main(String[] args) {
        
        int[] arr={15, 22, 8, 19, 31};
        int mx1=arr[0];
        int mx2=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mx1){
                mx2=mx1;
                mx1=arr[i];

            }else if (arr[i]>mx2 && arr[i]!=mx1)
            {
                mx2=arr[i];
            }

        }
        System.out.println("mx2 = " + mx2);
        System.out.println("mx1 = " + mx1);
    }
}
