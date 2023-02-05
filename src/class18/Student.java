package class18;

public class Student {
    /*Write a Student class that has instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.

*/
    String name, address;
    Student (String name, String address){
        this.name=name;
        this.address=address;

    }
    void displayInfo(){
        System.out.println(name+address);
    }

    public static void main(String[] args) {
        Student obj = new Student("Yuliya","620 S Dahlia");
        obj.displayInfo();
    }
}
