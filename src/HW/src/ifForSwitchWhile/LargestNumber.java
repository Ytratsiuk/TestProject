package HW.src.ifForSwitchWhile;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("enter three decimal numbers: ");
        double num1 = key.nextDouble();
        double num2 = key.nextDouble();
        double num3 = key.nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest number you entered");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest number you entered");
        } else {
            System.out.println(num3 + " is the largest number you entered");
        }
    }
}
