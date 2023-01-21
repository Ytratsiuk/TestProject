package homeworkArrays;

import java.util.Scanner;

public class ProjectTask1 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        int yourNumbers[]=new int[5];
        System.out.println("Enter five numbers");
        yourNumbers[0]=keyboard.nextInt();
        yourNumbers[1]=keyboard.nextInt();
        yourNumbers[2]=keyboard.nextInt();
        yourNumbers[3]=keyboard.nextInt();
        yourNumbers[4]=keyboard.nextInt();
        int sum=0;
        for(int i=0; i<yourNumbers.length; i++){
            sum=sum+yourNumbers[i];
        }
        System.out.println(sum);
    }
}
