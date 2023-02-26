package HW.src.sets;

import java.util.TreeSet;

//Create a Set collection in which you need to add names of the countries.
// In this set we want all objects to be sorted in alphabetical order.
// Using 2 different ways retrieve all elements from set.
public class SetCollection {
    public static void main(String[] args) {
        TreeSet <String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Portugal");
        countries.add("Spain");
        countries.add("USA");
        countries.add("France");
        for (String country : countries) {
            System.out.print(country+" ");
        }
        System.out.println();
        System.out.println(countries);
    }
}
