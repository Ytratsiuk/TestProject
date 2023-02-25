package HW.src.sets;

import java.util.ArrayList;
import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        //How can you remove all duplicates from ArrayList?
        HashSet<String> namesNoDuplicates = new HashSet<>(aList);
        System.out.println(namesNoDuplicates);
    }
    }
