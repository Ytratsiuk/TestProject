package homeworkClasses;

public class ArrayCountries {
    //Create 2D array of countries:
    // north america countries, south america countries, europe countries, asian countries, african countries.
    // Then print all values from that array using 2 different loops and calculate how many total countries been stored
    public static void main(String[] args) {

        String arr[][] = {{"Canada", "USA", "Mexico", "Cuba"},
                {"Brazil", "Argentina", "Columbia", "Peru"},
                {"Germany", "Italy", "Spain"},
                {"China", "India", "Indonesia"},
                {"Kenya", "Tanzania", "Morocco"}};

        int count = 0;

        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
        }
        System.out.println(count);*/
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            while (j < arr[i].length) {
                count++;
                System.out.println(arr[i][j]);
                j++;
            }
            i++;
            j = 0;
        }
        System.out.println(count);
    }
}
