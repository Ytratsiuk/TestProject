package Replits;
import java.util.Scanner;
public class Replit {
        public static void main(String[]args){
            Scanner key=new Scanner(System.in);
            System.out.println("Please enter your favorite car make");
            String car=key.next();
            switch (car){
                case "BMW":
                    System.out.println("Your favorite car is german car");
                    break;
                case "Toyota":
                    System.out.println("Your favorite car is japanese car");
                    break;
                case "Maserati":
                    System.out.println("Your favorite car is italian car");
                    break;
                default:
                    System.out.println("Your favorite car is unknown");
            }
        }

    }

