package HW.src.arrayList;

import java.util.LinkedList;
//Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
public class removeDivisible {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int a = 2; a <= 500; a+=2) {
            numbers.add(a);
        }
       numbers.removeIf(x -> x%5==0);
        System.out.println(numbers);
        }
    }
