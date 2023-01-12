package class4;
import java.util.Scanner;
public class FM {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        String gender=key.nextLine();
        System.out.println("Please enter your age");
        int age=key.nextInt();
        if (age>25){
            if(gender.equalsIgnoreCase("F")){
                System.out.println("Woman");
            }else if (age>25){
                System.out.println("Men");
            }
        }else if(age<25){
            if(gender.equals("F")){
                System.out.println("Girl");
            }else{
                System.out.println("Boy");
            }

        }
    }
}


