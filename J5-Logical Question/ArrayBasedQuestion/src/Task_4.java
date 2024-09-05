/*Find Maximum Element:

Task: Given an integer array, write a program to find and print the maximum element in the array.
Sample Input: [5, 12, 3, 19, 7, 26, 14]
Sample Output: Maximum Element = 26*/
public class Task_4 {
    public static void main(String[] args) {
        
        int[] arr={5, 12, 3, 19, 7, 26, 14};
        int mx=arr[0];

        for (int i = 0; i < arr.length; i++) {
          if (arr[i]>mx){
              mx=arr[i];
          }
        }
        System.out.println("mx = " + mx);
    }
}
