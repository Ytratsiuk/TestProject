package arraysMW;

public class ProjectTask9 {
    //Maximum and minimum number in the array
    public static void main(String[] args) {
        int arr[][] = {{10, 0, 80, 9}, {1, 4, 8, 100}};
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }System.out.println(max);
        System.out.println(min);
    }
}


