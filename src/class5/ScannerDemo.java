package class5;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double weight;

        /*Scanner=> Name of the class
        scan is just a variable like we create primitive variables
        = => assignment operator
        * */
        System.out.println("Please enter your age");
        int age= scan.nextInt();
        System.out.println("You are "+age+" year old");
        System.out.println("Please Enter your weight");
        weight=scan.nextDouble();
        System.out.println("your weight is "+weight+" Kgs");
        System.out.println("Are you hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);
       //* System.out.println("Please Enter your gender");
        char gender=scan.next().charAt(0); // char type of input
        System.out.println("Your gender is "+gender);
        System.out.println("Please Enter your name");
        String name=scan.next(); // when we have to taken only one word as input
        System.out.println("Your name is "+name);
        scan.nextLine(); // Trick to make nextline method work after we have used any other method from Scanner class
        System.out.println("Please Enter your full name ");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);
        scan.close(); // Good practice
    }
}