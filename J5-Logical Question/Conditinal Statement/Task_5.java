//Write a program to accept an integer from user and print positive, if the number is positive. 
//Otherwise, print negative. Considering number can never be equal to zero.

import java.util.Scanner;
class Task_5{

public static void main(String[] args){

  Scanner obj=new Scanner(System.in);
   System.out.println("Enter  Number");
     int n=obj.nextInt();
  

	if(n>0){
	System.out.println("Positive");
	}else if(n<0){
	System.out.println("Negative");
	}

}
}