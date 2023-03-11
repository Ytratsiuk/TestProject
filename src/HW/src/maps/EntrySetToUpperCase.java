package HW.src.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//205 Print all the values in upper case using entrySet
public class EntrySetToUpperCase {
    public static void main(String[] args) {
        HashMap<String, String> address = new HashMap<>();
        address.put("Street", "Patrick ST");
        address.put("Suite", "265");
        address.put("City", "Vienna");
        address.put("Zip", "22180");
        address.put("Country", "United State");

        Set<Map.Entry<String, String>> keysValues = address.entrySet();
        keysValues.stream().map(x -> x.getValue().toUpperCase()).forEach(System.out::println);
        String upperNow = keysValues.toString().toUpperCase();

    }
}

