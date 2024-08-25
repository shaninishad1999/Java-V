import java.util.Scanner;
/*Write a program print following menu to user:
  Main Menu:
  Press 1 for Addition,
  Press 2 for Subtraction,
  Press 3 for Multiplication,
  Press 4 fot Division,
  Press 0 to exit

  Accept user choice and based on choice perform operation by printing operation name and repeat until user enters 0.
  Ouptut
  Main Menu:
  Press 1 for Addition,
  Press 2 for Subtraction,
  Press 3 for Multiplication,
  Press 4 fot Division,
  Press 0 to exit

  input : 3

  Output
  Multiplication
  Main Menu:
  Press 1 for Addition,
  Press 2 for Subtraction,
  Press 3 for Multiplication,
  Press 4 fot Division,
  Press 0 to exit

  */

public class Task_2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        do {
            System.out.println("  Main Menu:\n" +
                    "  Press 1 for Addition,\n" +
                    "  Press 2 for Subtraction,\n" +
                    "  Press 3 for Multiplication,\n" +
                    "  Press 4 fot Division,\n" +
                    "  Press 0 to exit");
            int n=keyboard.nextInt();
              if (n==0){
                  break;

              }else if (n==1){
                  System.out.println("Addition");

              }else if (n==2){
                  System.out.println("Subtraction");

              }else if (n==3){
                  System.out.println("Multiplication");

              }else if (n==4){
                  System.out.println("Division");
              }
        }while (true);


    }
}
