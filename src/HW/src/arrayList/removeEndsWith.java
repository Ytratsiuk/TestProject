package HW.src.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;

//Create an arrayList of words. Remove every word that ends with “e”.
public class removeEndsWith {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("Polymorphism");
        words.add("Variable");
        words.add("Encapsulation");
        words.add("Inheritance");
        words.add("Abstraction");
        words.add("Aggregation");
        for (String word : words) {
            if(word.endsWith("e")){
                words.remove(word);
            }
        }
        System.out.println(words);
    }
}
