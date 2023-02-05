package Replits;

import java.util.Scanner;

public class Replit96 {
    //You have Scanner class to input string value.
    //If language is Java it should print the:"Java is a programming language".
    //If language is C it should print the:"C is a procedural programming language"
    //If language is C++ it should print the:"C++ is a middle-level programming language"
    //If any other should print:
    //"Doesn't match any programming language"
    Replit96(String name) {
        switch (name) {
            case "Java":
            case "C":
            case "C++":
                System.out.println(name + " is a programming language");
                break;
            default:
                System.out.println("Doesn't match any programming language");
        }

    }

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        String input = key.next();
        Replit96 obj = new Replit96(input);
    }
}
