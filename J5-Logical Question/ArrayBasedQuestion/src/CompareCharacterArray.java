/*Input: Array 1: An array of lowercase characters. Array 2: An array of uppercase characters. Expected Output:
The two arrays should be considered equal if they contain the same characters when case differences are ignored.

   char[] array1 = {'a', 'b', 'c', 'd'}; char[] array2 = {'A', 'B', 'C', 'D'};
   For this use the below function public static boolean compareArraysIgnoreCase(char[] array1, char[] array2)
   this method will return true if array are equals otherwise false.
* */
public class CompareCharacterArray {
    public static void main(String[] args) {
        char[] array1 = {'a', 'b', 'c', 'd'};
        char[] array2 = {'A', 'B', 'C', 'D'};

        System.out.println("compareArraysIgnoreCase(array1, array2) = " + compareArraysIgnoreCase(array1, array2));
    }

    public static boolean compareArraysIgnoreCase(char[] array1, char[] array2) {

        if (array1.length != array2.length) {
            return false;
        }


        for (int i = 0; i < array1.length; i++) {
            if (Character.toLowerCase(array1[i]) != Character.toLowerCase(array2[i])) {
                return false;
            }
        }

        return true;
    }
}
