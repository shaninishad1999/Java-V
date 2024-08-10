import java.util.Scanner;
class Task_1{

public static void main(String[] args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter Number");
int n=obj.nextInt();

while(n!=0){
int digit=n%10;
n/=10;
System.out.println(digit);
}


}
}