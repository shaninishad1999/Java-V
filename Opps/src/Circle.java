import java.util.Scanner;

public class Circle {
    private  double radius;

    public  Circle(){
        System.out.println("This is default constructor");
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }
    public  void  setRadius(double radius){
        this.radius=radius;
    }

    public double  areaCircle(double radius){
        return 3.14*radius*radius;
    }
    public  double  circumferenceCircle(double radius){
        return 2*3.14*radius;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius=obj.nextDouble();


        Circle circle=new Circle();
        circle.setRadius(radius);

        System.out.println("Radius = "+radius);
        System.out.println("Area = "+circle.areaCircle(radius));
        System.out.println("Perimeter = "+circle.circumferenceCircle(radius));

    }
}
