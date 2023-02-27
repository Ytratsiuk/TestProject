package HW.src.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Create a map of Best Buy store. Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.
public class BestBuy {
    public static void main(String[] args) {
        HashMap<Integer, String>  store = new HashMap<>();
        store.put(7664847,"Printer");
        store.put(7879885,"TV");
        Set<Map.Entry<Integer, String>> allKeysValues = store.entrySet();
        for (Map.Entry<Integer, String> keyValues:allKeysValues){
            System.out.println(keyValues.getKey()+" "+keyValues.getValue());
        }
    }
}
