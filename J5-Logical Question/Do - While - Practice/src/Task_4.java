import java.util.Scanner;

/*
Write a program to accept number from user, until user press 0 to exit. Print the average of all the entered number.
  Sample
  output : Enter an integer number, Press 0 to exit
  input : 10
  output : Enter an integer number, Press 0 to exit
  input : 20
  output : Enter an integer number, Press 0 to exit
  input : 30
  output : Enter an integer number, Press 0 to exit
  input : 40
  output : Enter an integer number, Press 0 to exit
  input : 50
  output : Enter an integer number, Press 0 to exit
  input : 0
  Average = 30
  Explanation:
  At First iteration user entered 10, so we have to repeat,
  At Second iteration user entered 20, so we have to repeat,
  At Third repeatation user entered 30, so we have to repeat,
  At Fourth repeatation user entered 40, so we have to repeat,
  At Fifth repeatation user entered 50, so we have to repeat,
  At Sixth repeatation user entered 0, so we have to stop and exit the loop.
  So there are total 5 times user values before stop, so average of entered number = 30.
*/
public class Task_4 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int sum=0,count=0;
        do {
            System.out.println("Enter an integer number, Press 0 to exit");
            int num=keyboard.nextInt();
            if (num != 0) {
                sum += num;
                count++;
            }

            if (num==0){
                break;
            }
        }while (true);
        System.out.println("Average = "+sum/count);
    }
}
