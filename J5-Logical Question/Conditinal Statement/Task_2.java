//Write a program that accept two numbers from the user and print equals if the numbers are equal.
import java.util.Scanner;
class Task_2{

public static void main(String[] args){

  Scanner obj=new Scanner(System.in);
   System.out.println("Enter Two Number");
     int a=obj.nextInt();
     int b=obj.nextInt();

	if(a==b){
	System.out.println("Equals");
	}	

}
}