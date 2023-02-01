package class17HW;

public class Student1 {
    // Write a Student class   that have instance variables name and address.
//  Create a constructor that will initialize those variables. Print name & address of given
//    student using displayInfo method.
    String name;
    String address;
    Student1 (String name, String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println(name+" lives at the address "+address);
    };



}



