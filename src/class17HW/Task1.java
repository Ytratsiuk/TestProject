package class17HW;

public class Task1 {
    //Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.
    int m;
    String name1;
    Task1 (int mEntry,String yourName){
        m=mEntry;
        name1=yourName;
    }
    Task1 (){};
    void print (){
    System.out.println("Your name is "+name1+" and the number you have entered is: "+m);

}
}