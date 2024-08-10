
import java.util.Scanner;
class Task_10{

public static void main(String[] args){

  Scanner obj=new Scanner(System.in);

    System.out.println("Enter Four Number");
 	int a=obj.nextInt();
	int b=obj.nextInt();
	int c=obj.nextInt();
	int d=obj.nextInt();

//if three numbers are equal, then the different one is odd one among them.

        if (a == b && b == c && d != a) {
            System.out.println("The odd one out is: " + d);
        } else if (a == b && b == d && c != a) {
            System.out.println("The odd one out is: " + c);
        } else if (a == c && c == d && b != a) {
            System.out.println("The odd one out is: " + b);
        } else if (b == c && c == d && a != b) {
            System.out.println("The odd one out is: " + a);
        } else {
            System.out.println("No three numbers are equal.");
        }

//if three number are even, then the different one is odd one among them.

        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0 && d % 2 != 0) {
            System.out.println("The odd one out is: " + d);
        } else if (a % 2 == 0 && b % 2 == 0 && d % 2 == 0 && c % 2 != 0) {
            System.out.println("The odd one out is: " + c);
        } else if (a % 2 == 0 && c % 2 == 0 && d % 2 == 0 && b % 2 != 0) {
            System.out.println("The odd one out is: " + b);
        } else if (b % 2 == 0 && c % 2 == 0 && d % 2 == 0 && a % 2 != 0) {
            System.out.println("The odd one out is: " + a);
        } else {
            System.out.println("Either not three even numbers or no odd one among them.");
        }

//if three number are odd, then the different one is odd one among them.

 if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0 && d % 2 == 0) {
            System.out.println("The odd one out is: " + d);
        } else if (a % 2 != 0 && b % 2 != 0 && d % 2 != 0 && c % 2 == 0) {
            System.out.println("The odd one out is: " + c);
        } else if (a % 2 != 0 && c % 2 != 0 && d % 2 != 0 && b % 2 == 0) {
            System.out.println("The odd one out is: " + b);
        } else if (b % 2 != 0 && c % 2 != 0 && d % 2 != 0 && a % 2 == 0) {
            System.out.println("The odd one out is: " + a);
        } else {
            System.out.println("Either not three odd numbers or no even one among them.");
        }

 // Check if three numbers are equal and the different one is the odd one out
        if (a == b && b == c && d != a) {
            System.out.println("The odd one out is: " + d);
        } else if (a == b && b == d && c != a) {
            System.out.println("The odd one out is: " + c);
        } else if (a == c && c == d && b != a) {
            System.out.println("The odd one out is: " + b);
        } else if (b == c && c == d && a != b) {
            System.out.println("The odd one out is: " + a);
        } else if (a != b && b != c && c != d && a != c && a != d && b != d) {
            System.out.println("No number is the odd one among them.");
        } else {
            System.out.println("No three numbers are equal.");
        }


}
}











