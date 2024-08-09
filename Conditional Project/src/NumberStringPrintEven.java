import java.util.Scanner;
//wap to accept 10digit number from user as a string and print all even digit
public class NumberStringPrintEven {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=null;
        System.out.println("Enter 10 digit");

           str=obj.nextLine();


        for (int i = 0; i <str.length() ; i++) {
            char digitchar=str.charAt(i);
            long digit=Integer.parseInt(digitchar+"");
           if(digit%2==0){
               System.out.println(digit);
           }


        }



    }
}
