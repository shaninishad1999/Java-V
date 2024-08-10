import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        int secondFirst = 0;
        int secondLast = 1;
        int nextTerm;
        

        System.out.print("Fibonacci Sequence: " + secondFirst + "\t" + secondLast);
        int sum=1;
        for (int i = 2; i < n; i++) {
            nextTerm = secondFirst + secondLast;
	 sum=sum+nextTerm;
            System.out.print("\t" + nextTerm);
            secondFirst = secondLast;
            secondLast = nextTerm;
        }
        
     System.out.print("  Sum = " + sum);
       
    }
}
