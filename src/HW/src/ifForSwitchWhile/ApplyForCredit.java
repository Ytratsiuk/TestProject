package HW.src.ifForSwitchWhile;

import java.util.Scanner;

public class ApplyForCredit {
    public static void main(String[] args) {
        Scanner board = new Scanner(System.in);
        String yes;
        for (int i = 0; i < 10; i++) {
            System.out.println("Would you like to apply for a credit card?");
            yes = board.next();
            if (yes.equals("yes")) {
                break;
            }
        }
    }
}
