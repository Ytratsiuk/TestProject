package class20HW;

public class Employee {
    //Create an Employee class that will have variables and methods.
    //Constructor that should initialize instance variables
    //Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    //Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    //Test your code!*/
    String name, lastName;
    int idNumber;
    boolean worksAtGoogle;

    Employee(String name, String lastName, int idNumber) {
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    String printBadge(boolean worksAtGoogle) {
        if (worksAtGoogle) {
            System.out.print(name + " " + lastName + " " + idNumber);
        }else{
            System.out.print("This employee does not work at Google IT Department. No info found. ");
        }
        return name + lastName + idNumber;
    }
}

class FullTime extends Employee {
    int hoursWorked;
    String project;

    void info() {
        System.out.println("This a full-time employee. Worked on "+project+" "+hoursWorked+" hours.");
    }

    FullTime(String name, String lastName, int idNumber, int hoursWorked, String project) {
        super(name, lastName, idNumber);
        this.hoursWorked = hoursWorked;
        this.project = project;
    }

}

class PartTime extends Employee {
    int hoursWorked;
    String workLocation;

    void info() {
        System.out.println("This a part time employee. Worked "+hoursWorked+" hours from "+workLocation);
    }

    PartTime(String name, String lastName, int idNumber, int hoursWorked, String workLocation) {
        super(name, lastName, idNumber);
        this.hoursWorked = hoursWorked;
        this.workLocation = workLocation;

    }
}

