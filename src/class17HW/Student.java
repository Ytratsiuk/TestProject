package class17HW;

public class Student {
    /*2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
     Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different
     students with different marks. Your program should print an average mark of each students name.
            NOTE: please use different names for instance and local variables.
            */
    String name;
    int math;
    int chemistry;
    int literature;

    Student(String name1, int math1, int chemistry1, int literature1) {
        name =name1;
        math = math1;
        chemistry = chemistry1;
        literature = literature1;
    }
    int averageGrade (){
        int averageGrade= (math+chemistry+literature)/3;
        return averageGrade;
    }

}
