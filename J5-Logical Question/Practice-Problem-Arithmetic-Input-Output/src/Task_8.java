/*If you know the balance and the annual percentage interest rate,
 you can compute the interest on the next monthly payment using the following formula:

interest = balance x (annualInterestRate/1200)

Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month.
*/

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the balance: ");
        double balance = scanner.nextDouble();

        // Prompt user to enter the annual percentage interest rate
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        // Calculate monthly interest
        double monthlyInterest = balance * (annualInterestRate / 1200);

        // Display the calculated interest
        System.out.printf("The interest for the next month is: %.2f%n", monthlyInterest);

    }
}
