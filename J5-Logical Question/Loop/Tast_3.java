import java.util.Scanner;
class Tast_3{

public static void main(String args[]){

Scanner obj=new Scanner(System.in);
System.out.print("Enter Number : ");
int sum=0;	
	while(true){
	int n=obj.nextInt();
	int num=n;
	if(n==0){
	break;
	}
	if(n%2==0){
	
	while(num!=0)
	{
	 int digit=num%10;
	  sum=sum+digit;
	  num/=10;
	}
	System.out.println("sum of even = "+sum);
	}
	}


}
}