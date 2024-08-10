//Write a program to accept three numbers from user and print equals if the numbers are equal.
import java.util.Scanner;
class Task_3{

public static void main(String[] args){

  Scanner obj=new Scanner(System.in);
   System.out.println("Enter Three Number");
     int a=obj.nextInt();
     int b=obj.nextInt();
     int c=obj.nextInt();

	if(a==b && b==c){
	System.out.println("Equals");
	}	

}
}