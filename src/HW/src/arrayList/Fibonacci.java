package HW.src.arrayList;

import java.util.LinkedList;

public class Fibonacci {
    public static void main(String[] args) {
        LinkedList<Integer> fibonacci = new LinkedList<>();
        int next = 1;
        int previous = 0;

        for (int i = 0; i < 10; i++) {
            fibonacci.add(previous);
            int temporary = previous;
            previous = next;
            next = next + temporary;

        }
        for (int numbers : fibonacci) {
            System.out.print(numbers + " ");
        }
    }
}
