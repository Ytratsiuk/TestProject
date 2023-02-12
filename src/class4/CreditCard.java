package class4;
import jdk.jshell.Snippet;

import java.util.Scanner;
public class CreditCard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String answer = keyboard.nextLine();
        if (answer.equals("yes")) {
            System.out.println("what is the balance on the card?");
            double balance = keyboard.nextDouble();
            if (balance > 1000) {
                System.out.println("Pay off immediately");
            } else {
                System.out.println("You can spend more");
            }
        } else {
            System.out.println("Would you like to get one?");
        }
    }
}
