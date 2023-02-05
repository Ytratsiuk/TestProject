package Replits;

import java.util.Scanner;

public class Replit103 {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String s = inp.nextLine();
            //write your code below
            StringBuilder  transit = new StringBuilder();
            for ( int i = 0; i < s.length(); i++){
                transit.append(s.charAt(i));
                transit.append(" ");

            }System.out.println(transit);
        }
    }

