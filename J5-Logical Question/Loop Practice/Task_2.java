import java.util.Scanner;
class Task_2{

public static void main(String[] args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter Number");
int n=obj.nextInt();
int sum=0;
while(n!=0){
int digit=n%10;
sum=sum+digit;
n/=10;

}
System.out.println(sum);


}
}