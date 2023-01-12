package class4;
import java.util.Scanner;


public class FToCConversion {
    public static void main(String[] args) {
        // Create a Java program that will ask user to input city and temperature.
        //Your program should convert Fahrenheit into celsius and print “The temperature in the city  is ”
        Scanner keyboard= new Scanner(System.in);
        System.out.println("What is the city?");
        String city=keyboard.next();
        System.out.println("What is the temperature in Fahrenheit?");
        int fahrenheit=keyboard.nextInt();
        int celsius;
        celsius=((fahrenheit-32)*5)/9;
        System.out.println("The temperature in "+city+" is "+celsius+" Celsius.");


    }
}
