import java.util.Scanner;
class Tast_10{

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Starting Number");
	int a=obj.nextInt();
	System.out.println("Enter Ending Number");
	int b=obj.nextInt();
	
	int sum=0;
	for(int i=a;i<b;i++)
	{
	sum=sum+i;
	}
	System.out.println("Sum = "+sum);
	
}
}