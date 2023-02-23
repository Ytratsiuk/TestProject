package HW.src.arrayList;

import java.util.ArrayList;

//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
public class replace {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Cola");
        drinks.add("Root Beer");
        drinks.add("Water");
        drinks.add("Soda");
        drinks.add("Coffee");
        drinks.add("Juice");
        drinks.add("Milk");
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i, "Water");
            }
        }
        System.out.println(drinks);
    }
}
