/*Write a program to display the length and capacity of String, StringBuilder and StringBuffer.*/
public class LengthAndCapacity {
    public static void main(String[] args) {

        String str1="Hello, Shanideval";
        System.out.println("str1 = " + str1);
        System.out.println("str1.length() = " + str1.length());
        System.out.println();
        StringBuffer stringBuffer=new StringBuffer("Hello, I am shanideval .");
        System.out.println("stringBuffer = " + stringBuffer);
        System.out.println("stringBuffer.length() = " + stringBuffer.length());
        System.out.println("stringBuffer.capacity() = " + stringBuffer.capacity());
        System.out.println();
        StringBuilder stringBuilder=new StringBuilder("Hello Sir, I am Here What can i help you?");
        System.out.println("stringBuilder = " + stringBuilder);
        System.out.println("stringBuilder.length() = " + stringBuilder.length());
        System.out.println("stringBuilder.capacity() = " + stringBuilder.capacity());

    }
}
