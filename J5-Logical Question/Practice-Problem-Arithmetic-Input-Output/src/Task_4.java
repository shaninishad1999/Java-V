import java.util.Scanner;

/*Write a program that converts inches to centimeters. For example, if the user enters 16.9 for a length in inches, the output would be 42.926 cm. (One inch equals 2.54 centimeters). Select appropriate datatype to hold length in inches and result in centimeters. Accept length from user. And display the output as 16.9 inches = 42.926 centimeters

Sample Run:
input
Enter length in inches: 16.9
output
16.9 inches = 42.926 centimeters.
*/
public class Task_4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter length in inches: ");
        double num = keyboard.nextDouble();

        System.out.printf("%.3f inches = %.3f centimeters", num, 2.54 * num);


    }
}
