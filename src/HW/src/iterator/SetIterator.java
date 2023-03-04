package HW.src.iterator;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
//Create a Set collection in which you want to preserve an order of inserted String Objects + 1 null value.
public class SetIterator {
    public static void main(String[] args) {
        Set<String> words = new LinkedHashSet<>();
        words.add("null");
        words.add("Sohil");
        words.add("Diego");
        words.add("Alijon");
        words.add("Asel");
        words.add("Sumair");

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
        for ( String word : words){
            System.out.println(word);
        }
    }
}

