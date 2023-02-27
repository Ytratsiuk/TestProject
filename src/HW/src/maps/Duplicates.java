package HW.src.maps;

import java.util.ArrayList;

//Create a collection of integers in which you can keep duplicates.
//Write a logic to find sum of all integers
public class Duplicates {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(2);
        numbers.add(1);
        numbers.add(100);

        int sum = 0;
        for ( int i =0; i<numbers.size(); i++){
            sum=sum+numbers.get(i);
        }
        System.out.println(sum);


    }
}
