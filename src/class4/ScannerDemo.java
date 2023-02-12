package class4;
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);  // helps us get the input from the keyboard
        System.out.println("Please enter your name");
        String name=input.nextLine();
        System.out.println(name);
    }


}
