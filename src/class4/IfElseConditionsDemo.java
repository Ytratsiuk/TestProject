package class4;

import java.util.Scanner;

public class IfElseConditionsDemo {
    public static void main(String[] args) {
        boolean mothersDay = true;
        if (mothersDay) {
            System.out.println("Happy Mother's Day");
        }


        String name = "Yuliya";
        if (name.equals("Yuliya")) {
            System.out.println("Authorized");
        }


        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your First and Last name?");
        String answer = keyboard.nextLine();
        String firstLastName = "Yuliya Tratsiuk";
        if (firstLastName.equals("Yuliya Tratsiuk")) {
            System.out.println("You can access the website");
        }
    }
}
