package arraysMW;

public class ArrayCountries {
    public static void main(String[] args) {
        String country[] = {"Belarus", "Russia", "Ukraine", "Kazakhstan", "Turkmenistan"};

        for (int i = 0; i < country.length; i++) {
            switch (country[i]) {
                case "Belarus":
                    System.out.println("Minsk");
                    break;
                case "Russia":
                    System.out.println("Moscow");
                    break;
                case "Ukraine":
                    System.out.println("Kiev");
                    break;
                case "Kazakhstan":
                    System.out.println("Astana");
                    break;
                case "Turkmenistan":
                    System.out.println("Ashgabat");
                    break;
            }
        }
    }
    //Create an array of countries.
    // While retrieving all values from an array print capital for each country choose any five countries.
}
