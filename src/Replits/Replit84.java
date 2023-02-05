package Replits;

public class Replit84 {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        for (int[] innerArray : a) {
            for (int val : innerArray) {
                if (val < 0 && val % 2 != 0) {
                    System.out.println(val);
                }
            }
        }


    }
}
