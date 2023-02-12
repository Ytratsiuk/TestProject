package class4;
import java.util.Scanner;
public class Loan {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("What the amount of loan is needed?");
        double loan=keyboard.nextDouble();
        if(loan<=200000) {
            System.out.println("I would lend you money.");
        }else{
            System.out.println("Sorry, I can't lend you that much money.");
        }
    }
}
