package HW.src.methods;

public class Translation {
        //Create a method that will say Hello in different language based on the country that will be
        // passed when method is executed
        void translate(String country) {
            switch (country) {
                case "USA":
                    System.out.println("Hello");
                case "Russia":
                    System.out.println( "Привет");
                case "Spain":
                    System.out.println( "Hola");
                case "China":
                    System.out.println( "Nǐ hǎo");
                case "Portugal":
                    System.out.println( "Oi");
                case "Japan":
                    System.out.println("Yā");
                case "Germany":
                    System.out.println("Hallo");
            }
        }
        public static void main(String[] args) {
            Translation trans = new Translation();
            trans.translate("Germany");
        }
    }

