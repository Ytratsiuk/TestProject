package HW.src.arrayList;

import java.util.ArrayList;
public class Test {
    public static void main(String []args){
        ArrayList <Integer> obj = new ArrayList <>();
        for ( int i = 1; i<=6; i++){
            // for ( int a = 111; a<=666; i+=111){
            obj.add(i * 111);
            // }
        }
        System.out.println(obj);
    }
}