package Replits;

import java.util.Scanner;

public class Replit95 {
//Using Scanner class input string value.
// Print out the following: "The first 3 letters of \_\_\_ is ___"
// For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String input = keyboard.next();
    String sbInput = input.substring(0,3);
    System.out.println("The first 3 letters of "+input+" is "+sbInput);
}

}
