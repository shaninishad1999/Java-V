import java.util.Scanner;
/*Write a program that prompts the user to enter the distance to drive, the fuel efficiency of the car
 in kilometer per liter, and the price per liter, and displays the cost of the trip.
  Please think of the formula to do calculation.

Sample Run
Input
    Enter the driving distance: 900.5
    Enter kilometer per liter: 18.5
    Enter price per liter: 106.55
Output
    The cost of driving is 5186.3932
    */
public class Task_10 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double drivingDistance= keyboard.nextDouble();
        System.out.print(" Enter kilometer per liter: ");
        double fuelPerLiter= keyboard.nextDouble();
        System.out.print(" Enter price per liter: ");
        double pricePerLiter= keyboard.nextDouble();

        System.out.println("The cost of driving is "+(drivingDistance/fuelPerLiter)*pricePerLiter);

    }
}
