import java.util.Scanner;
class Task_12{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);

System.out.println("Enter  Birth Year ");
int year=obj.nextInt();
String sign=null;
if(year%12==0){
   sign = "monkey";
  System.out.println("0 : "+sign);
}
else if(year%12==1){
   sign = " rooster";
  System.out.println("0 : "+sign);
}
else if(year%12==2){
   sign = "dog";
  System.out.println("0 : "+sign);
}
else if(year%12==3){
   sign = "monkey";
  System.out.println("0 : "+sign);
}
else if(year%12==4){
   sign = "monkey";
  System.out.println("0 : "+sign);
}
else if(year%12==5){
   sign = "ox";
  System.out.println("0 : "+sign);
}
else if(year%12==6){
   sign = "tiger";
  System.out.println("0 : "+sign);
}
else if(year%12==7){
   sign = "rabbit";
  System.out.println("0 : "+sign);
}
else if(year%12==8){
   sign = "dragon";
  System.out.println("0 : "+sign);
}
else if(year%12==9){
   sign = "snake";
  System.out.println("0 : "+sign);
}
else if(year%12==10){
   sign = "horse";
  System.out.println("0 : "+sign);
}
else if(year%12==11){
   sign = "sheep";
  System.out.println("0 : "+sign);
}

}
}