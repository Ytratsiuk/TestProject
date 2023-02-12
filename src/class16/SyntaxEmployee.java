package class16;

public class SyntaxEmployee {
    /*Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects*/
    int empID;
    int salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee object1 = new SyntaxEmployee();
        object1.empID = 5678;
        object1.salary = 100000;
        System.out.println(object1.empID+" "+ object1.salary+" "+CEO);
        SyntaxEmployee object2 = new SyntaxEmployee();
        object2.empID =7893;
        object2.salary = 30000;
        System.out.println(object2.empID+" "+ object2.salary+" "+CEO);
    }
}
