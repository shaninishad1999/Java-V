import java.util.Scanner;
class Tast_8{

public static void main(String args[]){

	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Magic Number");
	

	while(true){
	int num=obj.nextInt();
	if(num%9==1)
	{
	System.out.println("Magic Number Winner");
	break;
	}
	else{
	System.out.println("Try Again");
	}
	}

}
}