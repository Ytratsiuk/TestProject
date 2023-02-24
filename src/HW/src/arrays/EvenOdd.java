package HW.src.arrays;

public class EvenOdd {
    //Create a 2D array or integer type where you will store odd and even numbers.
    // Develop a program which will identify/print the even numbers only.
    public static void main(String[] args) {
        int[][] evenOdd ={{2,9,5,3,4,0,10},
                {29,92,56,31,46,0,190}
        };
        for(int i = 0; i<evenOdd.length; i++){
            for(int j = 0; j < evenOdd[i].length; j++) {
                if (evenOdd[i][j] % 2 == 0) {
                    System.out.println(evenOdd[i][j]);
                }
            }
        }
    }
}
