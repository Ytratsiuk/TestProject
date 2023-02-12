package class3;

import java.util.Scanner;

public class Decision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you going to the party?");
        String decision = scan.next();
        if (decision.equalsIgnoreCase("yes")) {
            System.out.println("Hurry up back home");
        } else {
            System.out.println("what are you going to do instead?");
            String decision2 = scan.next();
                if (decision2.equalsIgnoreCase("practice java")) {
                    System.out.println("Good job, practice makes it perfect");
                } else {
                    System.out.println("go study");
                }
            }
        }
    }
