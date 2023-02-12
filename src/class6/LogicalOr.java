package class6;

import java.util.Scanner;

public class LogicalOr {
    public static void main(String[] args) {
        System.out.println("Please enter the day");
        Scanner key=new Scanner(System.in);
        String day=key.next();
        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")) {
            System.out.println("No class today");
        }else if(day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")){
            System.out.println("Manual class today");
        }else if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Java class today");
        }else if(day.equalsIgnoreCase("Thursday")){
            System.out.println("Review class");
        }
    }
}
