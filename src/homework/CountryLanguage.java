package homework;

import java.util.Scanner;

public class CountryLanguage {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        System.out.println("Where are you from?");
        String country=key.nextLine();
        switch (country){
            case "The Bahamas":
            case "USA":
            case "Australia":
            case "Malta":
            case "United Kingdom":
            case "New Zealand":
            case "United States of America":
            case "Ireland":
            case "Jamaica":
            System.out.println("You most likely speak English");
            break;
            case "Argentina":
            case "Bolivia":
            case "Chile":
            case "Ecuador":
            case "Paraguay":
            case "Peru":
            case "Uruguay":
            case "Cuba":
            case "Puerto Rico":
            case "Dominican Republic":
            case "Costa Rica":
            case "Honduras":
            case "El Salvador":
                System.out.println("You most likely speak Spanish");
                break;
            case "Russia":
            case "Belarus":
            case "Kazakhstan":
            case "Kyrgyzstan":
                System.out.println("You most likely speak Russian");
                break;
            case "Belgium":
            case "Benin":
            case "France":
            case "Switzerland":
                System.out.println("You most likely speak French");
                break;
            case "China":
            case "Taiwan":
            case "Malaysia":
            case "Singapore":
                System.out.println("You most likely speak Chinese");
                break;
            default:
                System.out.println("Your country is not in our database. Sorrry:(");
        }
    }
}
