package homework;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("ENTER Quiz grade:  ");
        double quiz=keyboard.nextDouble();
        System.out.println("ENTER Mid Term Grade: ");
        double midTerm= keyboard.nextDouble();
        System.out.println("ENTER Your final Score: ");
        double finalScore= keyboard.nextDouble();
        double average=(quiz+midTerm+finalScore)/3;
        if(average>90) {
            System.out.println("A");
        }else if(average<50) {
            System.out.println("F");
        }else if(average>=50&&average<70) {
            System.out.println("C");
        }else {
            System.out.println("B");
        }
    }
}
