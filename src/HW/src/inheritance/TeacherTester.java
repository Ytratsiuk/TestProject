package HW.src.inheritance;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher myTeacher = new Teacher();
        PianoTeacher pianoTeacher = new PianoTeacher();
        MathTeacher mathTeacher = new MathTeacher();
        System.out.println(mathTeacher.infoExperience(6));
        System.out.println(mathTeacher.task(5,8));
        System.out.println(pianoTeacher.bigSmallClass(5));
        System.out.println(myTeacher.idCreator("Yuliya","Tratsiuk",5));
    }
}
