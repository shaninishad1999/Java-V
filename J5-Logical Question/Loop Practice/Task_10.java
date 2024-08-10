import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
  System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent (power): ");
        int power = scanner.nextInt();

int result=1;

  for (int i = 1; i <= power; i++) {
            result *= base;  
        }
	  System.out.println(base + " raised to the power of " + power + " is: " + result);

}
}