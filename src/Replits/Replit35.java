package Replits;
import java.util.Scanner;
public class Replit35{
        public static void main(String [] args){
            System.out.println("Do you need a loan?");
            Scanner in=new Scanner(System.in);
            boolean answer=in.nextBoolean();
            if(answer){
                System.out.println("What is your credit score?");
                int score=in.nextInt();
                if(score<600){
                    System.out.println("Not eligible");
                }else if(score>=600&&score<=700){
                    System.out.println("Maybe eligible");
                }else if(score>700&&score<=800){
                System.out.println("Eligible");
            }else{
                System.out.println("Definitely eligible");
            }
        }else{
            System.out.println("Unknown");
        }

    }
}
