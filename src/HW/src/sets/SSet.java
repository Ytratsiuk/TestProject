package HW.src.sets;

import java.util.HashSet;

//Create a Set collection that will hold Objects of Student Type. In this set we do not care
// about the insertion order. Each student object should have name and studentID. Display name of each student.
class Student {
    String name;
    String studentID;

    Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }
}

public class SSet {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("Maria", "2324l"));
        students.add(new Student("Anna", "8993k"));
        students.add(new Student("Peter", "3245p"));
        students.add(new Student("Remi", "4329e"));
        students.add(new Student("Blair", "3421d"));
        for (Student everyName : students) {
            System.out.println(everyName.name);

        }
    }
}
