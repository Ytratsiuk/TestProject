package Replits;

import java.util.Scanner;

public class Replit104 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.next();
        }
        for ( int i = 0; i< arr.length; i++){
            System.out.println(arr[i].substring(0,3));
        }

    }
}

