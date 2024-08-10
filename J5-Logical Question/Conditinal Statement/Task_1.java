//Write a program that accept an integer form user and print positive, if the integer is positive.
import java.util.Scanner;
class Task_1{

public static void main(String[] args){

  Scanner obj=new Scanner(System.in);
   System.out.println("Enter Any Number");
     int n=obj.nextInt();

	if(n>0){
	System.out.println("Positive");
	}	

}
}