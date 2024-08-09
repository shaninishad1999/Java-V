public class RectangleShape    {

   private double length;
   private double breadth;


   public  RectangleShape(){
       System.out.println("Default  constructors");
   }
    public RectangleShape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("parameterized constructors");
    }

//    getter and setter method

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
