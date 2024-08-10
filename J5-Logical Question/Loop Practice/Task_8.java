import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the 3 digit number ");
        int n = scanner.nextInt();
	int temp=n;
	int sum=0;
 while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit; 
            temp /= 10;
        }
	if(n==sum){
	System.out.println("Armstrong Number");
	}else{
	System.out.println("Not Armstrong Number");
	}
	

}
}