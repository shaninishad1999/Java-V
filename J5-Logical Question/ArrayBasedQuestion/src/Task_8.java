/*Copying Arrays:

Task: Create two integer arrays of size 5. Write a program to copy the elements of the first array into the second array.
Sample Input: First Array: [1, 2, 3, 4, 5]
Sample Output: Second Array: [1, 2, 3, 4, 5]*/
public class Task_8 {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};

        int[] arr2=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
            System.out.print(arr2[i]);
            if (i<arr.length-1){
                System.out.print(", ");
            }
        }
    }
}
