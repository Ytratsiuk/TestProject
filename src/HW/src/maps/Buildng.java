package HW.src.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

//Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..).
// Insert 7 entries with duplicate keys and values. Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map
public class Buildng {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> building = new LinkedHashMap<>();
        building.put(1, "Google");
        building.put(6, "Facebook");
        building.put(2, "Syntax");
        building.put(3, "Facebook");
        building.put(4, "Amazon");
        building.put(2, "Clearwing");
        building.put(7, "Columbia");
        System.out.println("LINKEDHASHMAP:");
        System.out.println(building);
        building.replace(4,"LinkedIn");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);

        Set<Integer> allKeys = building.keySet();
        System.out.println(allKeys);

        HashMap<Integer, String> floor = new HashMap<>();
        floor.put(1, "Google");
        floor.put(6, "Facebook");
        floor.put(2, "Syntax");
        floor.put(3, "Facebook");
        floor.put(4, "Amazon");
        floor.put(2, "Clearwing");
        floor.put(7, "Columbia");
        System.out.println("HASHMAP:");
        System.out.println(floor);
        floor.replace(4,"LinkedIn");
        System.out.println(floor);
        floor.remove(7);
        System.out.println(floor);

        Set<Integer> allKeyss = floor.keySet();
        System.out.println(allKeyss);

        TreeMap<Integer, String> floors = new TreeMap<>();
        floors.put(1, "Google");
        floors.put(6, "Facebook");
        floors.put(2, "Syntax");
        floors.put(3, "Facebook");
        floors.put(4, "Amazon");
        floors.put(2, "Clearwing");
        floors.put(7, "Columbia");
        System.out.println("TREEMAP:");
        System.out.println(floors);
        floors.replace(4,"LinkedIn");
        System.out.println(floors);
        floors.remove(7);
        System.out.println(floors);


        Set<Integer> allKey = floor.keySet();

        for ( Integer s : allKey){
            System.out.println(s);
        }
    }
}
