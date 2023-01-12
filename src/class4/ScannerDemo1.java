package class4;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Type your age");
        int age=keyboard.nextInt();
        System.out.println("You are "+age+" years old");
    }
}
