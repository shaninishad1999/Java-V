import java.util.Scanner;

public class Dog {
    private String dogName;
    private String dogBreed;

    public Dog(){
        System.out.println("This is default constructor");
    }
public Dog(String dogName,String dogBreed){
        this.dogName=dogName;
        this.dogBreed=dogBreed;
}

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Dog Name");
        String dogName=obj.nextLine();

        System.out.println("Enter Dog Breed");
        String dogBreed=obj.nextLine();

        Dog dog=new Dog();
        dog.setDogName(dogName);
        dog.setDogBreed(dogBreed);
        System.out.println("Dog Name = "+dog.getDogName());
        System.out.println("Dog Breed = "+dog.getDogBreed());

    }
}
