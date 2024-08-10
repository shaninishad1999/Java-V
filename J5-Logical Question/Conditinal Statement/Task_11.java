import java.util.Scanner;
class Task_11{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);

System.out.println("Enter Annual income ");
int income=obj.nextInt();

	if(income==300000)
	{
	System.out.println("After 0%  Tax  Income = "+income);
	}else if(income>300000 && income<=500000){
	
	System.out.println("Tax 5% = "+income*5/100);
	}else if(income>500000 && income<=1000000){
	
	System.out.println("Tax 15% = "+income*15/100);
	}else if(income>1000000 && income<=1500000){
	
	System.out.println("Tax 20%  = "+income*20/100);
	}else if(income>1500000 && income<=2000000){
	
	System.out.println("Tax 25% = "+income*25/100);
	}else{
	
	System.out.println("Tax 30% = "+income*30/100);
	}

}
}