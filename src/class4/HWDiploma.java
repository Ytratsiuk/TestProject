package class4;

import java.util.Scanner;

public class HWDiploma {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Is it true that you have a diploma? Answer true or false.");
        boolean diploma=keyboard.nextBoolean();
        if(diploma) {
            System.out.print("Congratulations!");
            System.out.println("What is your GPA score?");
            double score=keyboard.nextDouble();
            if (score >= 3.5){
                System.out.println("You are eligible for scholarship!");
            }else{
                System.out.println("You should have studied harder!");
            }
        }else{
            System.out.println("You better get a degree...");
        }
    }
}
