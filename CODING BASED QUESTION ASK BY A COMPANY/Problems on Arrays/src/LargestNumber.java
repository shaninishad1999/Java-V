import java.util.Scanner;

/*2.	Find the largest number in an array*/
public class LargestNumber {
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
//        logic for Largest number

        int largestNumber=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>largestNumber){
                largestNumber=arr[i];
            }
        }
        System.out.println("\nLargestNumber = " + largestNumber);
    }
}
