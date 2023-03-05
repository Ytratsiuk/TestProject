package HW.src.maps;

import java.util.Map;
import java.util.TreeMap;

public class EnchancedLoopMap {
    public static void main(String[] args) {
        Map<Integer, String> grocery = new TreeMap<>();
        grocery.put(1, "apple");
        grocery.put(2, "banana");
        grocery.put(4, "tomato");
        grocery.put(5, "mango");
        grocery.put(6, "kiwi");
        grocery.put(3, "pear");
        for (Integer i : grocery.keySet()) {
            System.out.println("Key is " + i + " item and values is " + grocery.get(i));
        }
    }
}
