package class4;

import java.util.Scanner;

public class NumberOfWorkedYears {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many years have you worked here?");
        int years = keyboard.nextInt();
        if (years >= 5) {
            System.out.println("You are eligible for the bonus");
            System.out.println("What is your salary?");
            int salary = keyboard.nextInt();
            if (salary > 50000) {
                System.out.println("You bonus is $5000");
            } else {
                System.out.println("You bonus is $3000");
            }
        } else {
            System.out.println("You are not eligible for the bonus");
        }
    }
}
