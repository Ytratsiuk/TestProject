package Replits;

public class Replit80 {
    public static void main(String[] args) {

        double[][] a = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };

        //Double and print array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = a[i][j] * 2;
                System.out.print(a[i][j]+" ");
            }System.out.println(" ");
            }
        }
    }

