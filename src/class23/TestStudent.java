package class23;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = {new SyntaxStudent(), new SchoolStudent(), new SyntaxStudent()};
        for (Student studentsAll : students) {
            studentsAll.aBehavior();
            studentsAll.anotherBehavior();
            studentsAll.commonBehavior();
        }
    }
}
