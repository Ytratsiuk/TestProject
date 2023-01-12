package homework;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the month you were born");
        String month=input.nextLine();
        switch (month){
            case "January":
            case "February":
            case "December":
                System.out.println("You were born in Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("You were born in Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("You were born in Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("You were born in Fall");
                break;
            default:
                System.out.println("Wrong input");
        }

    }
}
