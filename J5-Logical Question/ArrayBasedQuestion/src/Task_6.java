/*Reverse an Array:

Task: Create a program to reverse the elements in a character array and print the reversed array.
Sample Input: ['a', 'b', 'c', 'd', 'e']
Sample Output: ['e', 'd', 'c', 'b', 'a']*/
public class Task_6 {
    public static void main(String[] args) {
         char[] charArray={'a', 'b', 'c', 'd', 'e'};
        for (int i = charArray.length-1; i >=0; i--) {
            System.out.print("'"+charArray[i]+"' ");
            if (i>0){
                System.out.print(",");
            }

        }
    }
}
