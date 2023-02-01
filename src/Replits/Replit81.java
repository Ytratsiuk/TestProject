package Replits;

public class Replit81 {
    //Write a program that prints the highest value in the array.
    public static void main(String[] args) {
        int[] array = {5, 4, 8};
        int max=0;
        for (int i = 0; i < array.length; i++) {
            max = array[i];
            if (array[i] > max) {
                max = array[i];
            }
        }System.out.println("The largest number in the array is "+max);
    }
}
