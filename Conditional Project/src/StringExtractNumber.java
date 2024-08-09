import java.util.Scanner;

public class StringExtractNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter string and number");
        String str=obj.nextLine();


        for (int i = 0; i < str.length(); i++) {
            char digitchar=str.charAt(i);
            if (digitchar>'0' && digitchar<='9'){
                System.out.println(digitchar);
            }

        }
    }
}
