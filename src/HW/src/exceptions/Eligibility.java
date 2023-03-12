package HW.src.exceptions;
//Create a method to check age eligibility that will throw a runtime exception.
// Method should throw an exception age is less than 16.

import java.util.Scanner;

public class Eligibility extends Exception {
    public Eligibility(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = keyboard.nextInt();
        try {
            if (age < 16) {
                throw new Eligibility("age is less than 16");
            }
        } catch (Eligibility e) {
        }
    }
}
