package homeworkClasses;
//Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array using 2 different loops
public class ArrysCars {
    public static void main(String[] args) {
        String arr[][] = {{"Buick", "Cadillac", "Ford", "Dodge"},
                {"Hyundai", "Kia", "Columbia", "Peru"},
                {"Ferrari", "Lamborghini", "Fiat"},
                {"BMW", "Audi", "Volkswagen", "Porsche"},
        };
        for( int i = 0; i < arr.length; i++){
        for( int j = 0; j < arr[i].length; j++) {
            System.out.println(arr[i][j]);
        }
        }
        int i = 0;
        int j = 0;
        while (i < arr.length ) {
            while ( j < arr[i].length ){
                System.out.println(arr[i][j]);
                j++;}
            i++;
            j=0;
        }

    }
}
