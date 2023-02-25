package class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Fizzy");
        names.add("Savo");
        names.add("Sam");
        names.add("Urwa");
        names.add("Tarik");
        names.add("Abeera");
        System.out.println(names.contains("Daria"));
        names.remove("Sam");
        System.out.println(names);
    }
}
