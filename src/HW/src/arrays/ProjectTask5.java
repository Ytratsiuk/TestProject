package arraysMW;

public class ProjectTask5 {
    //Create a 2D array of integers.
    // Develop a program which will calculate the sum of  even and odd numbers for that array.

    public static void main(String[] args) {
     int[][] arr = {{4,5,6,7,8,9,10},{33,55,77,10,90},{45,78,34,22,44,55,66,77}};
     int sumEven = 0;
     int sumOdd = 0;
     for (int i = 0; i < arr.length; i++ ){
         for(int j = 0; j < arr[i].length; j++ ){
             if ( arr[i][j] % 2 == 0){
                 sumEven=sumEven+arr[i][j];
             }else{
                 sumOdd=sumOdd+arr[i][j];
             }
             }
         }
        System.out.println(sumOdd);
        System.out.println(sumEven);
     }
    }


