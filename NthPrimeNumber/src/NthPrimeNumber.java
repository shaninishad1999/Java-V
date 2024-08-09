import java.util.Scanner;

public class NthPrimeNumber {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter number");
        int n=obj.nextInt();

        int count=0;
      if (n>1){

        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                count++;
            }

        }
        if (count==2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
      }else {
          System.out.println("Not Posible to check prime number 0 and 1");
      }
    }
}
