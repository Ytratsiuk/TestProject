package class30;

import java.util.HashMap;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        HashMap <String, Double> fruits = new HashMap<>();
        fruits.put("Apple", 1.99);
        fruits.put("Orange", 3.99);
        fruits.put("Banana", 2.99);
        fruits.put("Kiwi", 9.99);
        fruits.put("Apple", 4.99);
        fruits.put(null, null);
        HashMap <String, Double> makeup = new HashMap<>();
        makeup.put("lipstick", 50.0);
        makeup.put("eyeliner", 30.0);
        makeup.put("mascara", 90.0);
        makeup.put("Foundation", 59.0);
        HashMap <String, Double> grocery = new HashMap<>();
        grocery.putAll(fruits);
        grocery.putAll(makeup);
        System.out.println(grocery);

        Set<String> allKeys = grocery.keySet();
        System.out.println(allKeys);
        allKeys.removeIf(x -> x.length()<7);
        System.out.println(grocery);
    }
}
