package class17HW;

public class StudentTester {
    public static void main(String[] args) {
        Student maria = new Student("Maria",40,50,90);
        System.out.println(maria.averageGrade());
        Student olga = new Student("Olga",30,54,96);
        System.out.println(olga.averageGrade());
        Student peter = new Student("Peter",41,23,79);
        System.out.println(peter.averageGrade());
        Student vasil = new Student("Vasil",39,64,20);
        System.out.println(vasil.averageGrade());
        Student roma = new Student("Roma",10,49,27);
        System.out.println(roma.averageGrade());
    }
}
