package HW.src.iterator;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
//Print all values using iterator and for loop
public class MapIterator {

    public static void main(String[] args) {
        LinkedHashMap<String, Object> orderPreserved = new LinkedHashMap<>();
        orderPreserved.put("Street", "Patrick ST");
        orderPreserved.put("Suite", 265);
        orderPreserved.put("City", "Vienna");
        orderPreserved.put("Zip", 22180);
        orderPreserved.put("Country", "United State");

        Set<Map.Entry<String, Object>> keyValues = orderPreserved.entrySet();
        for (Map.Entry<String, Object> each : keyValues) {
            System.out.println(each.getValue());
        }
        System.out.println();
        Iterator <Object>  iterator = orderPreserved.values().iterator();
        while (iterator.hasNext()) {
           Object value = iterator.next();
            System.out.println(value);
        }
    }
}