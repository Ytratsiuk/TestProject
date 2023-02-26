package HW.src.maps;

import java.util.Map;
import java.util.TreeMap;

public class Var {
    //Create a map of countries with its capital that will store countries in alphabetical order.
    //Print all keys and values from a country map using for each loop and iterator.
    //Print all values from a country map using for each loop and iterator.
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA", "DC");
        countries.put("Spain", "Madrid");
        countries.put("Germany", "Berlin");

//Set<Map.Entry<String, String>> -- not used anymore --> var
        //Set<Map.Entry<String, String>> entrySet = countries.entrySet();
        var entrySet = countries.entrySet();

//old way
        /*for (Map.Entry<String, String> entry : entrySet
        ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/

//now using var ---- only java 9 and upper
        for (var entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (Map.Entry<String, String> entry2 : entrySet
        ) {
            System.out.println(entry2.getValue());
        }
        var iterator= countries.entrySet().iterator();
            var entry = iterator.next();
            System.out.println(entry.getKey()+" "+entry.getKey());

    }
}
