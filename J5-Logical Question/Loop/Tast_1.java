import java.util.Scanner;
class Tast_1{

public static void main(String args[]){

Scanner obj=new Scanner(System.in);
System.out.print("Enter Number : ");

int sum=0;
	
	while(true){
	int num=obj.nextInt();
	int n=num;
	
	sum=sum+num;
	System.out.print("Sum of Enter Number : "+sum+"\n");
	if(n==0){
	break;
	}
	}


}
}