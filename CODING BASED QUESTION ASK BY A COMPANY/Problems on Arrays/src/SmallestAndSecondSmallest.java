import java.util.Scanner;

/*3.	Second Smallest and Second Largest element in an array*/
public class SmallestAndSecondSmallest {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int[] arr=new int[5];

        System.out.println("Enter Array Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=keyboard.nextInt();
        }

        System.out.println("Printed Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\t"+arr[i]);
        }

//        logic for second smallest and second largest element
        int firstLargestNumber=arr[0];
        int secondLargestNumber=arr[0];
        int firstSmallestNumber=arr[0];
        int secondSmallestNumber=arr[0];
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
