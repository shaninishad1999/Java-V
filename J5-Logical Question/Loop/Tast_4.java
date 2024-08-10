import java.util.Scanner;
class Tast_4{

public static void main(String args[]){

Scanner obj=new Scanner(System.in);
System.out.print("Enter Number : ");
int sum=0;	
int c=0;	while(true){
	int n=obj.nextInt();
	int num=n;
	if(n==0){
	break;
	}

	while(num!=0)
	{
	 int digit=num%10;
	  sum=sum+digit;
	c++;
	  num/=10;
	}
	System.out.println("sum of even = "+sum);
	System.out.println("Count="+c);
	
	}


}
}