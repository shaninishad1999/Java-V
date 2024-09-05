/*Count Occurrences of an Element:

Task: Write a program to count the number of times a specific character appears in a character array.
Sample Input: Array: ['a', 'b', 'a', 'c', 'a', 'd'], Character to count: 'a'
Sample Output: 'a' occurs 3 times*/
public class Task_10 {
    public static void main(String[] args) {
        char[] arr={'a', 'b', 'a', 'c', 'a', 'd'};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
                
            }
            
        }
        System.out.println("count = " + count);
    }
}
