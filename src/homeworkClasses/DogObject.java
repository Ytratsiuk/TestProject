package homeworkClasses;

public class DogObject {
    public static void main(String[] args) {
        homeworkClasses.ClassDog bobik= new homeworkClasses.ClassDog();
        bobik.breed="husky";
        bobik.size="medium";
        bobik.shedding=true;
        bobik.protect();
        bobik.bark();

        homeworkClasses.ClassDog chester= new homeworkClasses.ClassDog();
        chester.breed="buldog";
        chester.size="smal";
        chester.shedding=true;
        chester.protect();
        chester.bark();

        homeworkClasses.ClassDog fifi= new homeworkClasses.ClassDog();
        fifi.breed="labrador";
        fifi.size="large";
        fifi.shedding=true;
        fifi.protect();
        fifi.bark();
    }
}
