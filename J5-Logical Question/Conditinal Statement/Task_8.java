//Write a program to accept two numbers from user, if the both the numbers are positive, get the remainder of the division by 5 for both the numbers.
//  If remainder of both the division are equal print numbers are equal, otherwise number are not equal. 
// If one or both the numbers are negative, print calculation not possible.

import java.util.Scanner;
class Task_8{

public static void main(String[] args){

  Scanner obj=new Scanner(System.in);
   System.out.println("Enter two Number");
     int a=obj.nextInt();
     int b=obj.nextInt();


	if(a>0 && b>0) {
	int rem1=a%5;
	int rem2=b%5;
	if(rem1==rem2) {
	System.out.println("numbers are equal");	
	} else{
	System.out.println("number are not equal");
	}
	} else{
	System.out.println("calculation not possible.");
	
	}
	
}
}