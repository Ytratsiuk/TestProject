package class16;

public class Students {
   /* Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students*/
    String name;
    String ID;
    static int numberOfStudents=0;

    public static void main(String[] args) {
        Students yuliya = new Students();
        yuliya.name="Yuliya Tratsiuk";
        yuliya.ID="io890";
        yuliya.numberOfStudents++;
        Students gaga = new Students();
        gaga.name="Lady Gaga";
        gaga.ID="io987";
        gaga.numberOfStudents++;
        Students monkey = new Students();
        monkey.name="Monkey Wrench";
        monkey.ID="io345";
        monkey.numberOfStudents++;
        System.out.println(numberOfStudents);
    }

}
