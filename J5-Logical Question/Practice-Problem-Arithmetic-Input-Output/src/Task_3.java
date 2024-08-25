import java.util.Scanner;

/*Write a program to accept int length and int breadth of rectangle from user. Calculate int area and int perimeter of rectangle. Print the area and perimeter on the console.

    Formula to calculate area of square -> length * breadth
    Formula to calculate area of square -> 2 * (length + breadth)
    */
public class Task_3 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter Length = ");
        double length=keyboard.nextDouble();
        System.out.print("Enter Breadth = ");
        double breadth=keyboard.nextDouble();

        System.out.println("Area of square -> "+length*breadth);
        System.out.println("area of square -> "+2*(length+breadth));
    }
}
