package HW.src.arrayList;

import java.util.LinkedList;
//Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
public class removeDivisible {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int a = 1; a <= 500; a++) {
            numbers.add(a);
        }
        for (int i = 0; i<numbers.size(); i++) {

            if (numbers.get(i) % 5 == 0) {
                numbers.remove(numbers.get(i));
            }
        }
        System.out.println(numbers);
    }
}
