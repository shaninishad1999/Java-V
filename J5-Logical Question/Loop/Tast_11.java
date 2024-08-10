import java.util.Scanner;
class Tast_11{

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Starting Number");
	int a=obj.nextInt();
	System.out.println("Enter Ending Number");
	int b=obj.nextInt();
	int c=0;
	int sum=0;
	for(int i=a;i<=b;i++)
	{
	if(i%2==0)
	{
	sum=sum+i;
	c++;
	}
	
	}
	System.out.println("Sum = "+sum);
	System.out.println("Count = "+c);
}
}