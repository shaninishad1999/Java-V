import java.util.Scanner;

/*Write a program to get a substring of a StringBuffer.*/
public class SubstringFromStringBuffer {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter String");
        String str = keyboard.nextLine();

        StringBuffer stringBuffer = new StringBuffer(str);

        System.out.print("Enter the start index for the substring: ");
        int startIndex = keyboard.nextInt();

        System.out.print("Enter the end index for the substring: ");
        int endIndex = keyboard.nextInt();

        if (startIndex >= 0 && endIndex <= stringBuffer.length() && startIndex < endIndex) {
            String substring = stringBuffer.substring(startIndex, endIndex);
            System.out.println("substring = " + substring);

        } else {
            System.out.println("Invalid indices. Please ensure the start index is less than" +
                    " the end index and within range.");
        }

    }
}
