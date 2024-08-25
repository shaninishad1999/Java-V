import java.util.Scanner;

/*Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas:

    area = radius * radius * π
    volume = area * length

    value of π (PI) is  3.14
    Sample Run
    INPUT
    Enter the radius of a cylinder: 5.5
    Enter the length of a cylinder: 12

    OUTPUT
    The area is 95.0331
    The volume is 1140.4*/
public class Task_5 {
    public static void main(String[] args) {
        Scanner keyborad=new Scanner(System.in);
        System.out.print("Enter the radius of a cylinder: = ");
        double radius= keyborad.nextDouble();
        System.out.print("Enter the length of a cylinder = ");
        double length=keyborad.nextDouble();
        double area=radius*radius*Math.PI;

        System.out.printf("The area is %.2f%n", area);
        System.out.printf("The volume is %.2f%n", area * length);
    }
}
