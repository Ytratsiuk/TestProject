package class17;

public class Student {
    int id;
    int ageStudent;
    String nameStudent;
    double weightStudent;

        Student(int newID, int newAge, String newName,double newWeight){
            id = newID;
            ageStudent = newAge;
            nameStudent = newName;
            weightStudent = newWeight;
        }
        void infoCombined(){
            System.out.println(nameStudent+"'"+" ID number is "+id+", "+nameStudent+"'"+" weight is "+weightStudent+" kg, "+nameStudent+" is "+ageStudent+" years old.");

        };
    }
