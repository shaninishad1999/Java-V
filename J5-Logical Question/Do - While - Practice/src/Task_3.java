/*
Write a program to accept number from user, until user press 0 to exit.
Print the count of all the entered number exclude 0.
   output : Enter an integer number, Press 0 to exit
   input : 435
   output : Enter an integer number, Press 0 to exit
   input : 896
   output : Enter an integer number, Press 0 to exit
   input : 4
   output : Enter an integer number, Press 0 to exit
   input : 777
   output : Enter an integer number, Press 0 to exit
   input : 789
   output : Enter an integer number, Press 0 to exit
   input : 0

   count = 5

   Explanation:
   Total 5 numbers user entered before 0 to stop, So the count is 5 excluding 0.
 */

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner keybaord = new Scanner(System.in);
        int count = 0;
        do {
            System.out.println("Enter an integer number, Press 0 to exit");
            int num = keybaord.nextInt();
            count++;
            if (num==0){
                break;
            }
        } while (true);
            System.out.println("count = " + count);

    }
}
