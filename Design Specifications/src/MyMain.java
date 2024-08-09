
public class MyMain {


    public double calculatePerimeter(RectangleShape object) {
        double perimeter = 2 * (object.getLength()+ object.getBreadth());
        return perimeter;
    }
    public double calculateArea(RectangleShape object){
        double area=object.getLength()*object.getBreadth();
        return area;
    }
    public boolean isSameRectangle(RectangleShape rectangleShape1, RectangleShape rectangleShape2){
        if (rectangleShape1==rectangleShape2){
            return  true;
        }
        else if (rectangleShape1.getLength()==rectangleShape2.getBreadth()){
            return  true;

        }else {
            return false;

        }
    }

public static void main(String[] args){
    MyMain myMain = new MyMain();
    RectangleShape object1 = new RectangleShape(5.0, 3.0);
    RectangleShape object2=new RectangleShape(5.0,6.5);
    RectangleShape object3=new RectangleShape(5.0,6.5);






}
}

