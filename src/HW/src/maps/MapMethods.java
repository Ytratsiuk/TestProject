package HW.src.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, Object> address = new HashMap<>();
        address.put("Street", "Patrick ST");
        address.put("Suite", 265);
        address.put("City", "Vienna");
        address.put("Zip", 22180);
        address.put("Country", "United State");

        Map<String, Object> appleMap = new HashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00);
        appleMap.put("Quantity", 10);

        Map<String, String> map = new HashMap<>(3);
        map.put("ONE", null);
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");
        System.out.println(map);

        map.putIfAbsent("ONE","yuliya");
       /* System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());*/
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println(map);

        map.remove("ONE");
        System.out.println(map);
        Set<Map.Entry<String, String>> keysValues = map.entrySet();
        System.out.println(keysValues);
    }
}
