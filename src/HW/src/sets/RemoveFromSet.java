package HW.src.sets;

import java.util.LinkedHashSet;

//Create a Set of cities in which you want to make sure that insertion order is maintained.
// Then remove any city that starts with “A”;
public class RemoveFromSet {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet <>();
        cities.add("San Francisco");
        cities.add("Seattle");
        cities.add("Austin");
        cities.add("Boulder");
        cities.add("Washington, D.C.");
        cities.removeIf(x -> x.startsWith("A"));
        System.out.println(cities );
    }
}
