/* 1 Define an custom exception (i.e. user defined exception) class called "MyFirstException". This class contains a parameterized constructor which accept one argument String message. Whenever this exception arise will print "Custom Exception Occurred". Create another class called MyMain. This class contains main method, to perform sum of two user given values by using Scanner class. If the sum is less than 150 throw user defined exception or else display sum.

 input
     a = 30;
     b = 40;
     sum = a + b;
     as sum is 70 .. then

     output
     Custom Exception Occurred
     */
import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {

        try {
            Scanner obj = new Scanner(System.in);
            int a = obj.nextInt();
            int b = obj.nextInt();
            int c = a + b;
            if (c < 150) {

                MyFirstException ae = new MyFirstException("Custom Exception Occurred");
                throw ae;
            } else {
                System.out.println("Sum = " + c);
            }
        } catch (MyFirstException x) {
            System.out.println(x.getMsg());
        }
    }
}

