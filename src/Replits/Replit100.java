package Replits;

import java.util.Scanner;
//Write a for loop that will print out the reverse of the string.

public class Replit100 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String output="";
        for ( int i = s.length()-1; i >= 0; i--){
            output=output+s.charAt(i);
        }
        System.out.println(output);

    }
}
