package HW.src.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("I");
        list.add("am");
        list.add("hungry");
        list.add("now");

        list.forEach((n) -> System.out.println(n));
    }
}
