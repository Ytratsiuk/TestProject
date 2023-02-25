package HW.src.inheritance;

public class Teacher {
    //Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own
    // features and behaviour. Test all 4 classes
    String name, lastName, subject, experience, id;
    int  yearsWorked;

    String infoExperience ( int yearsWorked ){
        if ( yearsWorked> 2){
             experience = "experienced";
        }
        return experience;
    }

    void info (){
        System.out.println(name+lastName);
    }
    String idCreator (String name, String lastName, int yearsWorked){
       id=name+lastName+yearsWorked;
        return id;
    }
    void infoTeacher (){
        System.out.println(id+name+lastName+" teaches "+subject+" for "+yearsWorked+" years." );
    }
}
class MathTeacher extends Teacher{
    int result, a, b;
    int task (int a, int b){
        result=a+b;
        return result;
    }
    void info (){
        System.out.println("I am a math Teacher and the result of adding "+a+" and "+b+" is "+result);
    }
}class ChemistryTeacher extends Teacher{
    boolean danger;
    boolean info (boolean danger){
        if (  danger ){
            System.out.println("Chemistry Teacher works with dangerous stuff");
        } else{
            danger=false;
        }
        return danger;
    }

}
class PianoTeacher extends Teacher {
    int numberKids;

    String bigSmallClass(int numberKids) {
        if (numberKids < 5) {
            return "it is a small class";
        }
        return "it is a small class";
    }

    void skill (){
        System.out.println("Piano Teachers are talented");
    }

}

