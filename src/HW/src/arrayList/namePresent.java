package HW.src.arrayList;

import java.util.ArrayList;

//Create an ArrayList that will store 5 names into it.
//Find out whether the given ArrayList is empty or not?
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all the values
public class namePresent {
    public static void main(String[] args) {
        ArrayList<String> group = new ArrayList<>();
        group.add("Omir");
        group.add("Sam");
        group.add("Tatiana");
        group.add("Tami");
        group.add("Yuliya");
        if(!group.isEmpty()){
            System.out.println("The size of the group is "+group.size()+" people:");
            for ( String names : group){
                System.out.print(names+" ");
            }
            if(!group.contains("Shamil")){
                group.add("Shamil");
            }
            System.out.println();
            for ( String names : group){
                System.out.print(names+" ");
            }
        }
    }
}
