/* 2 Write a program to demonstrate boxing and un-boxing.*/

public class BoxingUnboxing {
    public static void main(String[] args) {
        // Boxing: converting primitive type to wrapper class object
        int primitiveInt = 100;
        Integer boxedInt = primitiveInt; // Autoboxing

        // Print the boxed object
        System.out.println("Boxed Integer: " + boxedInt);

        // Unboxing: converting wrapper class object back to primitive type
        Integer anotherBoxedInt = 200;
        int unboxedInt = anotherBoxedInt; // Autounboxing

        // Print the unboxed primitive type
        System.out.println("Unboxed Integer: " + unboxedInt);

        // Demonstrating boxing and unboxing with other types

        // Boxing
        double primitiveDouble = 50.5;
        Double boxedDouble = primitiveDouble; // Autoboxing

        // Print the boxed object
        System.out.println("Boxed Double: " + boxedDouble);

        // Unboxing
        Double anotherBoxedDouble = 75.75;
        double unboxedDouble = anotherBoxedDouble; // Autounboxing

        // Print the unboxed primitive type
        System.out.println("Unboxed Double: " + unboxedDouble);

        // Boxing and Unboxing with Character
        char primitiveChar = 'X';
        Character boxedChar = primitiveChar; // Autoboxing
        System.out.println("Boxed Character: " + boxedChar);

        Character anotherBoxedChar = 'Y';
        char unboxedChar = anotherBoxedChar; // Autounboxing
        System.out.println("Unboxed Character: " + unboxedChar);
    }
}
