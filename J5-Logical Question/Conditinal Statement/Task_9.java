
import java.util.Scanner;
class Task_9{

public static void main(String[] args){

  Scanner obj=new Scanner(System.in);
	int crAmount=5000;
   System.out.println("current balance = "+crAmount);
   System.out.println("Enter  for withdrawal amount");
     int wdAmount=obj.nextInt();

	if(wdAmount<crAmount)
	{
	 int decAmount=crAmount-wdAmount;
	
	if(decAmount<500){
	
	int penlAmount=50;
	crAmount=decAmount-penlAmount;
	
	   System.out.println("current balance = "+crAmount+ "\n  Penalty = "+penlAmount);
	}else{

	   System.out.println("current balance= "+crAmount);
	}
	}else{
	   System.out.println("insufficient funds");
	}

	
}
}