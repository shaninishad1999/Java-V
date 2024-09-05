/*Shift Array Elements:

Task: Write a Java program to shift all elements of an integer array to the left by one position.
Sample Input: [10, 20, 30, 40, 50]
Sample Output: [20, 30, 40, 50, 10]*/
public class Task_12 {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50};

        int k=2;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            System.out.println("arr = " + arr[i]);

        }

    }
}
