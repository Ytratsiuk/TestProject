package HW.src.arrays;

public class PrimeNotPrime {
    //Write a java program to check whether a given number is prime or not from a 2D array
    public static void main(String[] args) {
        boolean flag = false;
        int a = 2;
        int num[][] = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 1, 2, 13, 14, 15, 16, 17, 18, 19, 20}, {21, 22, 23, 24, 25, 26, 27, 28, 29, 30}};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                while (a <= num[i][j] / 2) {
                    if (num[i][j] % a == 0) {
                        flag = true;
                        a++;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println(num[i][j] + " is not a prime number");
                } else {
                    System.out.println(num[i][j] + " is a prime number");
                }
            }
        }
    }
}