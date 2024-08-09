import java.util.Scanner;

public class DublicateDigit {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter digit in string");
        String str=obj.nextLine();


        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    System.out.println("Duplicate Value = " + str.charAt(i) );
                }
            }
        }
    }
}
