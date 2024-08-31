
/*3 Write a program to demonstrate autoboxing and unboxing.*/
public class AutoboxingUnboxing {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive types to wrapper class objects
        int primitiveInt = 42;
        Integer boxedInt = primitiveInt; // Autoboxing
        System.out.println("Boxed Integer: " + boxedInt);

        double primitiveDouble = 3.14159;
        Double boxedDouble = primitiveDouble; // Autoboxing
        System.out.println("Boxed Double: " + boxedDouble);

        char primitiveChar = 'A';
        Character boxedChar = primitiveChar; // Autoboxing
        System.out.println("Boxed Character: " + boxedChar);

        // Unboxing: Converting wrapper class objects back to primitive types
        Integer anotherBoxedInt = 100;
        int unboxedInt = anotherBoxedInt; // Unboxing
        System.out.println("Unboxed Integer: " + unboxedInt);

        Double anotherBoxedDouble = 2.71828;
        double unboxedDouble = anotherBoxedDouble; // Unboxing
        System.out.println("Unboxed Double: " + unboxedDouble);

        Character anotherBoxedChar = 'B';
        char unboxedChar = anotherBoxedChar; // Unboxing
        System.out.println("Unboxed Character: " + unboxedChar);

        // Using wrapper class objects in collections
        // Autoboxing is used when adding primitives to collections
        java.util.List<Integer> integerList = new java.util.ArrayList<>();
        integerList.add(10); // Autoboxing int to Integer
        System.out.println("List with Integer: " + integerList);

        // Unboxing is used when retrieving primitives from collections
        int listValue = integerList.get(0); // Unboxing Integer to int
        System.out.println("Retrieved value from list: " + listValue);
    }
}
