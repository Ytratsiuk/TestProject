package class3;

import java.util.Scanner; //you hav to have this thing when using scanner

public class Rent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);                    //introduce a customer spase to answer on console
        System.out.println("What is your Monthly rent?");
        int rent = scan.nextInt();                              //this way we store the integer type customer answer into variable
        if (rent > 2000) {
            System.out.println("You better move to a cheaper State");
        } else if (rent < 1000) {
            System.out.println("Consider Buying a house and live here forever");
        } else {
            System.out.print("The price is ok, you may stay for a while");
        }
    }
}
