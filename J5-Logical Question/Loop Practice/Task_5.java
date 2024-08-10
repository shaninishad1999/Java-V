import java.util.Scanner;
class Task_5{

public static void main(String[] args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter Number");
int n=obj.nextInt();
int f=0;

for(int i=1;i<=n;i++){
if(n%i==0){
f++;
}
}
if(f==2){
System.out.println("Prime Number");
}else{

System.out.println("Not prime Nuber");
}
}
}