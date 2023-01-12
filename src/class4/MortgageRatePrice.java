package class4;
import java.util.Scanner;
public class MortgageRatePrice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the rate?");
        double rate = keyboard.nextDouble();
        if (rate < 4.5) {
            System.out.println("What is the price for the house?");
            double price = keyboard.nextDouble();
            if (rate < 4.5&price > 200000) {
                    System.out.print("I will consider buying a house");
                    System.out.println(" and I will take a loan");
                } else {
                    System.out.print("I will consider buying a house");
                    System.out.println(" and I will pay cash");
                }
            } else {
                System.out.println("I won't buy a house");
            }
        }
    }

