//Write a program to accept an integer from user. If the number is even make it odd and print.
// If the number is odd make it even and print.

import java.util.Scanner;
class Task_7{

public static void main(String[] args){

  Scanner obj=new Scanner(System.in);
   System.out.println("Enter  Number");
     int n=obj.nextInt();
  n++;

	if(n%2==0){
	System.out.println("Even");
	}else{
	System.out.println("Odd");
	}

}
}