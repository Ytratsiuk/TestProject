package HW.src.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Create a Hash Map of String pairs, Using entry set print key and values pairs using loop. remove ONE, FOUR, print
public class RemoveMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");
        Set<Map.Entry<String, String>> allKeysValues = map.entrySet();
        System.out.println("HashMap Before Remove :");
        for (Map.Entry<String, String> pair : allKeysValues) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");
        allKeysValues.removeIf(x -> x.getKey().equals("ONE") || x.getKey().equals("FOUR"));

        for (Map.Entry<String, String> pair : allKeysValues) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }

}
