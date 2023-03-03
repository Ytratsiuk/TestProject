package HW.iterator;
//207

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Using EntrySet print the key and values pairs using iterator only
//replace with below key THREE--> ASEL and key FIVE-->SUMAIR
//Using EntrySet print the key and values pairs using iterator only
public class ValueKeyIterator {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");
        
        Set<String> everyKV = map.keySet();
        System.out.println("HashMap Before Replace :");
        Iterator<String> iterator = everyKV.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " = " + map.get(key));
        }
        System.out.println("HashMap After Replace :");
        map.put("THREE", "ASEL");
        map.put("FIVE", "SUMAIR");
        Iterator<String> iterator1 = everyKV.iterator();
        while (iterator1.hasNext()) {
            String key = iterator1.next();
            System.out.println(key + " = " + map.get(key));
        }
    }
}










