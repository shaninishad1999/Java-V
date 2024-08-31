/* 6 Write a program to print the smaller of the two given Integer, Double and Character Objects.*/
public class SmallestOfTwoObjects {

    public static void main(String[] args) {
        // Create sample Integer, Double, and Character objects
        Integer int1 = 42;
        Integer int2 = 75;

        Double double1 = 3.14;
        Double double2 = 2.71;

        Character char1 = 'A';
        Character char2 = 'Z';

        // Print the smallest of each type
        System.out.println("Smaller Integer: " + getSmaller(int1, int2));
        System.out.println("Smaller Double: " + getSmaller(double1, double2));
        System.out.println("Smaller Character: " + getSmaller(char1, char2));
    }

    // Method to find the smaller of two Integer objects
    public static Integer getSmaller(Integer a, Integer b) {
        return (a < b) ? a : b;
    }

    // Method to find the smaller of two Double objects
    public static Double getSmaller(Double a, Double b) {
        return (a < b) ? a : b;
    }

    // Method to find the smaller of two Character objects based on ASCII values
    public static Character getSmaller(Character a, Character b) {
        return (a < b) ? a : b;
    }
}

