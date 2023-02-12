package class4;

public class Practice {
    public static void main(String[] args) {
        boolean breakTime = false;
        if (breakTime) {
            System.out.println("Let's take a break");
        } else {
            System.out.println("let's continue the class");
        }


        int a = 9;
        if (a == 1) {
            System.out.println("Monday");   //using if else makes the program run faster in oppose to just if
        } else if (a == 2) {
            System.out.println("Tuesday");
        } else if (a == 3) {
            System.out.println("wednesday");
        } else if (a == 4) {
            System.out.println("thursday");
        } else if (a == 5) {
            System.out.println("Friday");
        } else if (a == 6) {
            System.out.println("Saturday");
        } else if (a == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong day number");

        }
        int number1=10;
        int number2=20;
        if(number1==number2) {
            System.out.println("numbers are equal");
        }else if(number1>number2) {
            System.out.println("Number1 is greater than number2");
        }else if(number2>number1){
            System.out.println("Number2 is greater than Number1");
        }

    }
}

