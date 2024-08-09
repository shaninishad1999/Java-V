public class Car {
    private  String make;
    private String model;
    private  int year;
    private  String color;

    public Car(){
        System.out.println("Default constrator");
    }
    public  Car(String make,int year,String model,String color){
        System.out.println("Parameterized constructor");
        this.make=make;
        this.year=year;
        this.model=model;
        this.color=color;
    }
public String displayInfo(){
//  /  return make+" "+year +" "+ model +" "+ color;
    return toString();
}

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
