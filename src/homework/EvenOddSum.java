package homework;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner board = new Scanner(System.in);
        System.out.println("Please enter start and end points");
        int start = board.nextInt();
        int end = board.nextInt();
        int sumOdd = 0;
        int sumEven = 0;
        if (start < end) {
            for (; start <= end; start++) {
                if (start % 2 == 0) {
                    sumEven += start;
                } else {
                    sumOdd += start;
                }
            }
            System.out.println(sumEven);
            System.out.println(sumOdd);
        } else {
            for (; start >= end; start--) {
                if (start % 2 == 0) {
                    sumEven += start;
                } else {
                    sumOdd += start;
                }
            }
            System.out.println(sumEven);
            System.out.println(sumOdd);
        }

    }
}



