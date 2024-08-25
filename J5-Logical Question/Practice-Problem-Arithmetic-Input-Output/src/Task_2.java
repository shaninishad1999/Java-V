import java.util.Scanner;

/*Write a program to accept int side of a Square from user. Calculate int area and int perimeter of square. Print the area and perimeter on the console.

    Formula to calculate area of square -> side * side
    Formula to calculate area of square -> 4 * side*/
public class Task_2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter Side ");
        double side=keyboard.nextDouble();

        System.out.println(" Area of square -> "+side*side);
        System.out.println("Area of square -> "+ 4*side);
    }
}
