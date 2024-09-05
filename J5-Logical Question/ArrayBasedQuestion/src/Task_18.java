import java.util.Scanner;

/*Product of Array Elements:

Task: Write a Java program to find the product of all elements in a double array.
Sample Input: [1.5, 2.0, 3.5]
Sample Output: Product = 10.5
*/
public class Task_18 {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);
        float[] arr=new float[3];
        System.out.println("Sample Input");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=keyboard.nextFloat();
        }
        float product=1.0f;
        for (int i = 0; i < arr.length; i++) {
             product*=arr[i];

        }
        System.out.println("Sample Output: " + product);
    }
}
