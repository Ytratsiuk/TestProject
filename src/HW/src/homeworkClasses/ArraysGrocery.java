package homeworkClasses;

import java.util.Arrays;

public class ArraysGrocery {
    //Using 2D array create a grocery list.
   // Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops
    public static void main(String[] args) {
        String arr[][] = {{"Milk", "Cheese", "Eggs"},
                {"Avocado", "Tomatoes", "Carrots", "Celery"},
                {"Apples", "Bananas"},
                {"Hummus", "Dip", "Peanut Butter"},
                {"Dates", "Nuts", "Raisins", "Dried Apricot"}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        System.out.println(Arrays.toString(arr));
        }
    }

