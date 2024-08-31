import java.util.Scanner;

/*Write a program to concatenate StringBuilder & StringBuffer objects.

 */
public class ConcatenateStringBuilderAndStringBuffer {
    public static void main(String[] args) {

        Scanner keyboard=new Scanner(System.in);

        System.out.println("Enter String 1");
        String str1=keyboard.nextLine();
        System.out.println("Enter String 2");
        String str2=keyboard.nextLine();

        StringBuilder stringBuilder=new StringBuilder(str1);
        StringBuffer stringBuffer=new StringBuffer(str2);

        stringBuilder.append(stringBuffer);

        System.out.println("stringBuilder = " + stringBuilder);
        
    }

}
