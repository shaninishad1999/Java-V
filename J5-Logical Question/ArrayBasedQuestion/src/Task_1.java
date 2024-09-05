/*Integer Array Initialization:

Task: Create an integer array of size 5 and initialize it with the values 10, 20, 30, 40, and 50.
Sample Input: None (initialize directly).
Sample Output: [10, 20, 30, 40, 50]*/
public class Task_1 {
    public static void main(String[] args) {

        int [] arr={10,20,30,40,50};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i<arr.length-1){
                System.out.print
                        (", ");
            }
        }
    }
}
