//Write a program to accept three numbers from user and print all are divisible by 9, if all three numbers are divisible by 9.
import java.util.Scanner;
class Task_4{

public static void main(String[] args){

  Scanner obj=new Scanner(System.in);
   System.out.println("Enter Three Number");
     int a=obj.nextInt();
     int b=obj.nextInt();
     int c=obj.nextInt();

	if(a%9==0 && b%9==0 && c%9==0){
	System.out.println("all are divisible by 9");
	}	

}
}