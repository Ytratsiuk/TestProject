package HW.src.ifForSwitchWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter number 1: ");
        double num1 = keyboard.nextDouble();
        System.out.println("enter number 2: ");
        double num2 = keyboard.nextDouble();
        System.out.println("enter operation you would like to perform: ");
        char operator = keyboard.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.print("The result is " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.print("The result is " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.print("The result is " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.print("The result is " + result);
                break;
            default:
                System.out.println("Invalid input");
        }

    }
}
