package class3;

import java.sql.SQLOutput;

public class IfElse {
    public static void main(String[] args) {
        int expenses = 1000;
        int salary=4000;
        int rent=1200;
        int moneyLeft=salary-rent-expenses;
        if (moneyLeft>= 300) {
            System.out.println("let's go shopping"); // do not forget { after else condition
        }
        if (moneyLeft <= 300) {
            System.out.println("Save more");
        }
        int age;
        age=19;
        if(age<18){
            System.out.println("it is time to play");
        }
        boolean syntaxBootCamp=true; //if condition is based on boolean true or false if we have a true inside the if() it executes all the code inside {}

        if (syntaxBootCamp) {
            System.out.println("time to start practicing java");
        }
        char c='f';
        if(c=='M'){
            System.out.println("male");
        }


        String name ="Yuliya";                   // with non-primitive data types such as string we can't use == symbol
        if(name.equals("sam")){
            System.out.println("Amazing student");
        }
        if(!name.equals("sam")){
            System.out.println("Super amazing student");
        }
        boolean hungry =true;
        //System.out.println(hungry); true
        //System.out.println(!hungry); reverse--- false
        if(!hungry){               //! changes to reverse value
            System.out.println("lets eat");
        }
        if(moneyLeft>=300) {
            System.out.println("lets go shopping");
        }else{
            System.out.println("Save some money");
        }


        if(rent>2000) {
            System.out.println("You better move to a cheaper State");
        }else{
            System.out.print("You may stay for a little while. ");
            if(rent<1000) {
                System.out.println("Buy a house, live here forever");
            }else{
                System.out.print("But not for long!");
            }
        }
        }


    }

