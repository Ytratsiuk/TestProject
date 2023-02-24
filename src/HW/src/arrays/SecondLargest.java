package HW.src.arrays;

public class SecondLargest {
    //Write a java program to find the second largest number in the array
    public static void main(String[] args) {
        int arr[][] = {{17, 208, 341, 40, 55, 67, 108, 9}, {1, 20, 3, 4, 5, 6, 100, 0}};
        int max = arr[0][0];
        int max1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max1 = max;
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max1);
    }
}
