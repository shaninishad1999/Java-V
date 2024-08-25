import java.util.Scanner;

/*Average acceleration is defined as the change of velocity divided by the time taken to make the change, as shown in the following formula:

    a = (v1 - v0) / t
Write a program that prompts the user to enter the starting velocity v0 in meters/second, the ending velocity v1 in meters/second, and the time span t in seconds, and displays the average acceleration.

Sample Run
Input
Enter v0 : 5.5
Enter v1 : 50.9
Enter t  : 4.5

Output
The average acceleration is 10.0889*/
public class Task_7 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Enter v0 : ");
        double v0= keyboard.nextDouble();
        System.out.print("Enter v1 : ");
        double v1= keyboard.nextDouble();
        System.out.print("Enter v0 : ");
        double t= keyboard.nextDouble();

        System.out.printf("The average acceleration is %3f",(v1-v0)/t);

    }
}
