package HW.src.ifForSwitchWhile;

public class PatterIncreasinDecreasing {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < a; j++) {
                System.out.print(j + " ");
            }
            a--;
            System.out.println();

        }
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < b; j++) {
                System.out.print(j + " ");
            }
            b++;
            System.out.println();

        }
    }
}
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//1 2 3 4 5 6 7
