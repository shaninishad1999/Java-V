import java.util.Scanner;

public class Person {

    private String name;
    private int age;

    // Default constructor
    public Person() {
        System.out.println("This is the default constructor");
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("This is paramerized constructor");
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = obj.nextLine();
        System.out.println("Enter Age");
        int age = obj.nextInt();

        // Create a Person object
        Person person = new Person();
        person.setName(name); // Set the name using setter
        person.setAge(age);   // Set the age using setter

        // Print the name and age using getter
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
