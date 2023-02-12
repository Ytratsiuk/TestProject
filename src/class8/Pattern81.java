package class8;

public class Pattern81 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j <= 5 * i; j += i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
