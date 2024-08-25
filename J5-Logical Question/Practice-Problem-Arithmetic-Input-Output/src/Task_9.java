import java.util.Scanner;

/*Ravi and Shyam were playing a game. In the first turn of the game, Ravi will give an integer dividend and an
integer divisor to Shyam. Then Shyam has to tell him the remainder of the division. In the second turn,
Shyam will repeat the procedure. To help them, please write a program that accepts Dividend,
and Divisor from the user and print the remainder on the console. hint

*/
public class Task_9 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter dividend = ");
        int dividend= keyboard.nextInt();
        System.out.print("Enter divisor = ");
        int divisor= keyboard.nextInt();

        int Remainder=dividend%divisor;
        int Quotient=dividend/divisor;
        System.out.println("Remainder = " + Remainder);
        System.out.println("Quotient = " + Quotient);



    }
}
