import java.util.Scanner;

/*1.	Find the smallest number in an array*/
public class SmallestNumberI {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int[] arr=new int[5];

        System.out.println("Enter Array Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=keyboard.nextInt();
        }

        System.out.println("Printed Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
//        logic for smallest number

        int smallestNumber=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<smallestNumber){
                smallestNumber=arr[i];
            }
        }
        System.out.println("\nsmallestNumber = " + smallestNumber);
    }
}
