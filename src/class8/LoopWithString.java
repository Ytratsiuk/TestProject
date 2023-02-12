package class8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        while (key.next().equalsIgnoreCase("Sha")) {
            System.out.println("Great student Sha");
        }

    }
}
