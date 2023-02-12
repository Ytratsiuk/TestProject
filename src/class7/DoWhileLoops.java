package class7;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        do {
            System.out.println("please Enter a number");
            num = keyboard.nextInt();
        }while (num != 5) ;
    }
}
