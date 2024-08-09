package design.one;

import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName=obj.nextLine();
        System.out.println("Enter Last Name");
        String lastName=obj.nextLine();

        UserName userName = new UserName();
        userName.setFirstName(firstName);
        userName.setLastName(lastName);
        System.out.println("Full Name = "+userName.fullName());

        int noOfVowels = MyUtility.countVowel(userName);
        System.out.println("noOfVowels = " + noOfVowels);
    }
}
