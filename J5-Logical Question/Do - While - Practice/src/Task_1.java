import java.util.Scanner;
/*Write a program to print Hello World on console, and ask user, Do you want to continue?
Press 1 to continue, Press 0 to exit. Accept user choice.
Sample:
     Hello World
     Do you want to continue? Press 1 to continue, Press 0 to exit
  input = 1
     Hello World
     Do you want to continue? Press 1 to continue, Press 0 to exit
  input = 0
  Explanation:
     Output is printed on screen, not get the user input, based on user input 1, we will continue to print again. When user input is 0, we stops repeating.

*/
public class Task_1 {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);

        do {
            System.out.println("Hello World");
            System.out.println("Do you want to continue? Press 1 to continue, Press 0 to exit");
            int n=keyboard.nextInt();
            if (n==0){
              break;
            }
        }while (true);
    }
}
