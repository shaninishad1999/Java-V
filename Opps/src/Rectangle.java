import java.util.Scanner;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(){
        System.out.println("This is the default Constructor");
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double areaCalculated(double width,double height){
        return width*height;
    }
    public double perimeterRect(double width,double height)
    {
        double per=2*(width+height);
        return per;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Width = ");
        double width = obj.nextDouble();
        System.out.println("Enter Height = ");
        double height = obj.nextDouble();

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(width);
        rectangle.setHeight(height);

        System.out.println("Width = " + rectangle.getWidth());
        System.out.println("Height = " + rectangle.getHeight());
        System.out.println("Area= " + rectangle.areaCalculated(width,height));
        System.out.println("Perimeter = "+rectangle.perimeterRect(width,height));

    }
}
