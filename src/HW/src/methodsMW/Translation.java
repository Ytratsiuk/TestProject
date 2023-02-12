package methodsMW;

public class Translation {
        //Create a method that will say Hello in different language based on the country that will be
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
            methodsMW.Translation trans = new methodsMW.Translation();
            System.out.println(trans.translate("Germany"));
        }
    }

