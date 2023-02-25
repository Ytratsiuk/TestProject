package HW.src.arrayList;

import java.util.ArrayList;
public class Add111to666 {
    public static void main(String []args){
        ArrayList <Integer> obj = new ArrayList <>();
        for ( int i = 1; i<=6; i++){
            // instead if for loop:
            obj.add(i * 111);
        }
        System.out.println(obj);
    }
}