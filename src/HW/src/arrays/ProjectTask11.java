package arraysMW;

public class ProjectTask11 {
    //Write a program to print out duplicate elements from an Array of Strings
    public static void main(String[] args) {
        String arr[] = {"Mama", "Papa", "daughter", "son", "hamster", "Mama"};
        for (int i = 0; i < arr.length-1; i++) {
            for ( int j = 0; j < arr.length; j++){
                if ( (arr[i].equals(arr[j]))&&(i!=j)){
                    System.out.println(arr[i]);
                }
            }

           }
        }
    }

