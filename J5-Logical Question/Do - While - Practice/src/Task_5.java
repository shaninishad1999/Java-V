import java.util.Scanner;

/*
Write a program to accept number from user, until user press 0 to exit. Print the count of all the entered even number exclude 0.
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
   count = 2
   Explanation:
   Total 5 numbers user entered before 0 to stop, So the count of even number is 2 excluding 0.
* */
public class Task_5 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int count=0;
        do {
            System.out.println(" Enter an integer number, Press 0 to exit");
            int num=keyboard.nextInt();

            if (num==0){
                break;
            }
            if (num%2==0){
                count++;
            }
        }while (true);
        System.out.println("count = " + count);
    }
}
