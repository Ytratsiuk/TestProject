package HW.src.ifForSwitchWhile;

import java.util.Scanner;

public class GradeExplained {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your grade?");
        String grade = keyboard.next();
        switch (grade) {
            case "A":
                System.out.println("Grade " + grade + " means Excellent");
                break;
            case "B":
                System.out.println("Grade " + grade + " means Good");
                break;
            case "C":
                System.out.println("Grade " + grade + " means Average");
                break;
            case "D":
                System.out.println("Grade " + grade + " means Bad");
                break;
            default:
                System.out.println("Not acceptable grade: " + grade);
        }

    }
}
