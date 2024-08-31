/* 1 Create objects of all the wrapper classes and print then on console, with using constructor.*/
public class WrapperClasses {
    public static void main(String[] args) {
        // Creating objects of all wrapper classes using constructors
        Byte byteObject = new Byte((byte) 10);
        Short shortObject = new Short((short) 20);
        Integer integerObject = new Integer(30);
        Long longObject = new Long(40L);
        Float floatObject = new Float(50.5f);
        Double doubleObject = new Double(60.6);
        Character charObject = new Character('A');

        // Printing the objects
        System.out.println("Byte object: " + byteObject);
        System.out.println("Short object: " + shortObject);
        System.out.println("Integer object: " + integerObject);
        System.out.println("Long object: " + longObject);
        System.out.println("Float object: " + floatObject);
        System.out.println("Double object: " + doubleObject);
        System.out.println("Character object: " + charObject);
    }

}
