package Replits;
import java.util.Scanner;
import java.util.Arrays;
public class Replit77 {
    //Then print out all the elements you have created in the first loop in reverse order.
        public static void main(String[] args) {
            int arr[]=new int[5];
            Scanner scanner=new Scanner(System.in);
            //this loop will take all 5 numbers from the user
            for( int i =0; i<arr.length; i++){
                arr[i]=scanner.nextInt();
            }
//this code will print all those numbers in reverse order
            for(int i = arr.length-1; i>=0;i--){
                System.out.println(arr[i]);
            }
        }
}

