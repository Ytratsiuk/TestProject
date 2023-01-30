package homework;
import java.util.Scanner;
public class Replit36 {
        public static void main(String[]args){
            Scanner key=new Scanner(System.in);
            System.out.println("Please enter two strings");
            String say1=key.next();
            String say2=key.next();
            System.out.println("Please enter two numbers");
            int num1=key.nextInt();
            int num2=key.nextInt();
            if (num1==num2&&say1.equals(say2)){
                System.out.println("AND");
            } else if(num1==num2||say1.equals(say2)){
                System.out.println("OR");
            }else if(num1!=num2&&!say1.equals(say2)){
                System.out.println("NONE");
            }
        }

    }

