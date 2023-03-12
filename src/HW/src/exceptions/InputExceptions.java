package HW.src.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

//How would handle InputMismatchException?
// Input Mismatch Exception when user enters mismatch value then programmer expected.
public class InputExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students = 0;
        do {
            try {
                System.out.print("Enter the number of students: ");
                students = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Invalid number of students. ");
            }
            input.nextLine();
        } while (students <= 0);
    }
}