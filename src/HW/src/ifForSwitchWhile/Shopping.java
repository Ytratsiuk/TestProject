package HW.src.ifForSwitchWhile;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat Us = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("What are you buying?");
        String needThis = scanner.next();
        System.out.println("How much does it cost?");
        double price = scanner.nextDouble();
        double paid = 0;
        while (paid <= price) {
            System.out.println("How much are you paying today?");
            double payment = scanner.nextDouble();
            paid += payment;
            double balance = price - paid;
            if (balance >= 0) {
                System.out.println("The remaining balance is " + Us.format(balance));
            } else {
                double change = -balance;
                System.out.println("Your change is " + Us.format(change));
            }
        }
        System.out.println("Thank you for shopping!");
    }
}

