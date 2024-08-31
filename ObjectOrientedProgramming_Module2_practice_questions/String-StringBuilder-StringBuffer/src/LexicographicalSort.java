import java.util.Arrays;

/*Write a program to lexicographically arrange the given strings "Raman" , "Aman" , "Vikram" , "Shyam" and "Bhuvan".*/
public class LexicographicalSort {
    public static void main(String[] args) {
        // Define the array of strings
        String[] strings = {"Raman", "Aman", "Vikram", "Shyam", "Bhuvan"};

        // Sort the array lexicographically
        Arrays.sort(strings);

        // Print the sorted array
        System.out.println("Strings in lexicographical order:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
