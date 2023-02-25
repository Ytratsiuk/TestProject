package HW.src.arrayList;

import java.util.LinkedList;

public class DynamicArrayRemove {
    public static void main(String[] args) {
        LinkedList<String> b = new LinkedList<>();
        b.add("hi");
        b.add("yo");
        b.add("suo");
        b.add("yolo");
        b.add("boop");
        for (int i = 0; i < b.size(); i++) {
            b.remove(i);
        }
        for (String word : b) {
            System.out.print(word + " ");
        }
    }
}
