package HW.src.sets;

import java.util.HashSet;
import java.util.Set;

//Create a Set collection that will hold Objects of Student Type. In this set we do not care
// about the insertion order. Each student object should have name and studentID. Display name of each student.
class Student {
    private String name;
    private String studentID;

    Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }
}

public class ObjectMap {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Maria", "2324l"));
        students.add(new Student("Anna", "8993k"));
        students.add(new Student("Peter", "3245p"));
        students.add(new Student("Remi", "4329e"));
        students.add(new Student("Blair", "3421d"));
        for (Student everyName : students) {
            System.out.println(everyName.getName());

        }
    }
}
