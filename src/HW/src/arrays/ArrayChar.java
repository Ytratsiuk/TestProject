package HW.src.arrays;

//Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array
public class ArrayChar {
    public static void main(String[] args) {
        char grade[] = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] == 'B') {
                System.out.println(grade[i]);
                break;
            }
        }
        char grades[] = new char[6];
        grades[0] = 'A';
        grades[1] = 'B';
        grades[2] = 'C';
        grades[3] = 'D';
        grades[4] = 'E';
        grades[5] = 'F';
        System.out.println(grade[1]);
    }

}
