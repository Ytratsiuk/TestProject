package class4;
import java.util.Scanner;
public class ScannerPractice {
        public static void main(String[]args){
            Scanner keyboard=new Scanner(System.in);
            System.out.println("How old are you?");
            int age=keyboard.nextInt();
            System.out.print("Your age after 10 years is ");
            System.out.println(age+10);
            keyboard.close();
        }
    }
