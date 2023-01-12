package homework;

import java.util.Scanner;
public class WeekWeekend {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a day number");
        int dayNumber=input.nextInt();
      switch (dayNumber) {
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
              System.out.println("Weekday");
              break;
          case 6:
          case 7:
              System.out.println("Weekend");
              break;
          default:
              System.out.println("Invalid day");
      }
    }
}
