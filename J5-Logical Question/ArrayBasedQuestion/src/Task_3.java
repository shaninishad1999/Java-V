/*Average of Array Elements:

Task: Create a float array of size 7. Write a program to calculate the average of the elements in the array.
Sample Input: [1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f]
Sample Output: Average = 4.7857143*/
public class Task_3 {
    public static void main(String[] args) {
        float[] floatArray={1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f};
        float floatSum=0.0f;

        for (int i = 0; i < floatArray.length; i++) {
            floatSum+=floatArray[i];

        }
        System.out.println("floatSum = " + floatSum);
        float average = floatSum/ floatArray.length;

        // Print the average with seven decimal places
        System.out.printf("Average = %.7f", average);

    }
}
