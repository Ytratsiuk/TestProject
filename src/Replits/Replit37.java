package homework;
import java.util.Scanner;
public class Replit37 {
        public static void main(String[]args){
            Scanner key=new Scanner(System.in);
            System.out.println("Are you thirsty?");
            boolean thirsry=key.nextBoolean();
            System.out.println("Are you sleepy?");
            boolean sleepy=key.nextBoolean();
            if(thirsry&&!sleepy){
                System.out.println("Looks like you need to drink water");
            }else if(thirsry&&sleepy){
                System.out.println("Looks like you need to drink coffee");
            }else if(!thirsry&&sleepy){
                System.out.println("Looks like you need to drink tea");
            }else{
                System.out.println("Looks like you need to drink nothing");
            }
        }
    }

