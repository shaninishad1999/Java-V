import java.util.Scanner;
class Tast_2{

public static void main(String args[]){

Scanner obj=new Scanner(System.in);
System.out.print("Enter Number : ");
	
	while(true){
	int n=obj.nextInt();
	if(n==0){
	break;
	}
	if(n%2==0){
	System.out.println(n);
	}else{
	System.out.println("Odd");
	}
	}


}
}