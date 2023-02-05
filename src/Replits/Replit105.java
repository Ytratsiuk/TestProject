package Replits;

import java.util.Scanner;

public class Replit105 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String another = word.replaceAll("[^aeiou]", "");
        System.out.println( another);

    }
}
