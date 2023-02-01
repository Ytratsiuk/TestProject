package Replits;

public class Replit83 {
    //Write a program that calculates the sum of elements from each row in a 2D array and adds them into array
    // of integers
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
        int sum = 0;
        for (int[] innerArray : a) {
            for (int val : innerArray) {
                sum=sum+val;
                System.out.print(" "+val);
            }
            System.out.println(" "+sum);
            System.out.println();
            sum=0;
        }
    }
}
