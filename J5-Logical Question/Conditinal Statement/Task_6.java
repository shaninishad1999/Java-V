//Write a program to accept an integer from user and print even if the number is even, Otherwise print odd.

import java.util.Scanner;
class Task_6{

public static void main(String[] args){

  Scanner obj=new Scanner(System.in);
   System.out.println("Enter  Number");
     int n=obj.nextInt();
  

	if(n%2==0){
	System.out.println("Even");
	}else{
	System.out.println("Odd");
	}

}
}