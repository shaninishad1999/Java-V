import java.util.Scanner;

public class MyMain {

    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("make of the car");
        String make=sc.nextLine();
        System.out.println("year of the car ");
        int year=sc.nextInt();
        System.out.println("model");
        sc.nextLine();
        String model=sc.nextLine();
        System.out.println("color");
        String color=sc.nextLine();


        Car obj=new Car(make,year,model,color);

        System.out.println(obj.displayInfo());

    }
}
