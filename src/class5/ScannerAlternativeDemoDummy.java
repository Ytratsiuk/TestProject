package class5;

import javax.swing.JOptionPane;

public class ScannerAlternativeDemoDummy {
    public static void main(String[] args) {

        /*Scanner=> Name of the class
        scan is just a variable like we create primitive variables
        = => assignment operator
        * */
        int age= Integer.parseInt(JOptionPane.showInputDialog("Please enter your age "));
        System.out.println("You are "+age+" year old");
        String weight= JOptionPane.showInputDialog("Please Enter your weight ");
        System.out.println("your weight is "+weight+" Kgs");
        String hungry= JOptionPane.showInputDialog("Are you hungry?");
        String gender= JOptionPane.showInputDialog("Please Enter your gender ");
        System.out.println("Your gender is "+gender);
        String name= JOptionPane.showInputDialog("Please Enter your full name ");
        System.out.println("Your full name is "+name);

    }
}