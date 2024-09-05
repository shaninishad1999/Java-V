/*Element Search in Array:

Task: Write a Java program to search for a specific integer in an array and print its index if found.
Sample Input: Array: [4, 8, 15, 16, 23, 42], Search Element: 16
Sample Output: Element 16 found at index 3*/
public class Task_7 {
    public static void main(String[] args) {

        int[] arr={4, 8, 15, 16, 23, 42};
       int k=16;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==k){
                System.out.println("Element "+ k+" found at index "+i);
            }
        }
    }
}
