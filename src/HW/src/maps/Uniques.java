package HW.src.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//Create the collection that will store single unique Objects of a String type in which order is preserved.
//Write a logic to concatenate all string from the collection.
public class Uniques {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> words = new LinkedHashMap<>();
        words.put(1, "ba");
        words.put(5, "la");
        words.put(3, "kla");
        words.put(2, "va");
        Set < Map.Entry < Integer, String >> allKeysValues = words.entrySet();
        for ( Map.Entry < Integer, String > word : allKeysValues){
            System.out.print(word.getValue());
        }
    }
}
