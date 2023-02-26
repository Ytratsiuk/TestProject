package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class removing {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1, "Nezir");
        studentsMap.put(2, "Shah");
        studentsMap.put(3, "Tami");
        studentsMap.put(4, "Aisha");
        studentsMap.put(5, "Aisha");
        studentsMap.put(6, "Aisha");
        studentsMap.put(7, "Aisha");

        Set<Integer> allKeys = studentsMap.keySet();
        allKeys.removeIf(x -> x > 2);
        System.out.println(studentsMap);

        Collection<String> names = studentsMap.values();
        names.removeIf(x -> x.contains("i"));
        System.out.println(names);


    }
}
