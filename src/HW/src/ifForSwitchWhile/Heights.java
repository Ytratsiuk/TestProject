package ifForSwitchWhile;

import java.util.Scanner;

public class Heights {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your height in inch");
        double height = in.nextDouble();
        if (height < 60) {
            System.out.println("you are short");
        } else if (height > 72) {
            System.out.println("You are tall");
        } else {
            System.out.println("You are medium");
        }
    }
}
