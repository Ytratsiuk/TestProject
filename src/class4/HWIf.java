package class4;
import java.util.*;
class Main {
    public static void main(String[]args){
        Scanner key=new Scanner(System.in);
        System.out.println("Please enter first number");
        int x=key.nextInt();
        System.out.println("Please enter second number");
        int y=key.nextInt();
        boolean result=true;
        if(x*y>0){
            System.out.println(result);
        }else {
            System.out.println(!result);
        }
    }


}