package class15HW;

public class Translation {
        //Create a method that will say Hello in different language based on the country that will
        // passed when method is executed
        String translate(String country) {
            switch (country) {
                case "USA":
                    return "Hello";
                case "Russia":
                    return "Привет";
                case "Spain":
                    return "Hola";
                case "China":
                    return "Nǐ hǎo";
                case "Portugal":
                    return "Oi";
                case "Japan":
                    return "Yā";
                case "Germany":
                    return "Hallo";
            }
            return country;
        }

        public static void main(String[] args) {
            class15HW.Translation trans = new class15HW.Translation();
            System.out.println(trans.translate("Germany"));
        }
    }

