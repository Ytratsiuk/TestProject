package class4;
import java.util.Scanner;
public class DMV {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("How old are you?");
        int age=keyboard.nextInt();
        if(age>=18){
            System.out.println("You are eligible to have a driver license. Complete Theoretical and Practical Exams. Come back with the results");
        }else{
            System.out.println("You may apply for a learners permit only");
        }

    }
}
