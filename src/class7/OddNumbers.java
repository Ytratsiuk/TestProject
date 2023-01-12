package class7;

public class OddNumbers {
    public static void main(String[] args) {
        for (int num = 1; num < 20; num += 2){ //faster code---
            System.out.println(num);
        }
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {

            } else {
                System.out.println(i);

            }
        }
    }
}




