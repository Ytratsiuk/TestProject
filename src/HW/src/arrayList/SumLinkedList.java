package HW.src.arrayList;

import java.util.LinkedList;
//add the numbers 111-666 and print its sum (repl)
public class SumLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        int sum = 0;
        for (int a = 111; a <= 666; a += 111) {
            numbers.add(a);
            sum = sum + numbers.get(a);
        }
        for (int i = 0; i <numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        System.out.println(sum);
    }

}
