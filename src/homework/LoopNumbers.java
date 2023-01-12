package homework;

public class LoopNumbers {
    public static void main(String[] args) {
        for (int a = 1; a <= 100; a++) {
            System.out.println(a);
        }
        for (int b = 1; b <= 15; b++) {
            if (b % 2 == 0) {

            } else {
                System.out.println(b);
            }
        }
        for (int c = 5; c <= 50; c++) {
            if (c % 5 == 0) {
                System.out.println(c);
            }
        }
        for (int d = 1; d <= 100; d++) {
            System.out.print(d + " ");

        }
        for (int e = 100; e >= 1; e--) {
            System.out.println(e + " ");
        }

//        Print even numbers from 20 to 1 (2 ways)
        for (int f = 20; f >= 1; f--) {
            System.out.println(f);
        }
        for (int g = 1; g <= 20; g++) {
            System.out.println(g);
        }
//        Print odd numbers between 20 and 50 (2 ways)

        for (int i = 20; i <= 50; i++) {
            if (i % 2 == 0) {

            } else {
                System.out.println(i);
            }
        }
        for (int i = 20; i <= 50; i++) {
            if (i % 2 != 0) {
            System.out.println(i);
            }
        }
    }
}

