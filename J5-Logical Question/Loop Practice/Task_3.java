import java.util.Scanner;
class Task_3{

public static void main(String[] args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter Number");
int n=obj.nextInt();
int sum=0;
for(int i=1;i<=n;i++){
if(i%2==0){
sum=sum+i;
}
}
System.out.println(sum);
}
}
