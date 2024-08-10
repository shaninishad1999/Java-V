import java.util.Scanner;
class Task_4{

public static void main(String[] args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter Number");
int n=obj.nextInt();

int k=1;
while(n!=1){
k=k*n;
n--;

}
System.out.println(k);
}
}
