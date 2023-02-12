package HW.src.stringMethod;

public class VowelsPrivate {
//Create a method that will accept a String as a parameter
// and return a new String that consist only of vowels.
// Method should be available inside the class only where it was declared and executed by calling it is name.
 private static String vowelOnly (String phrase){
     return phrase.toUpperCase().replaceAll("[BCDFGJKLMNPQSTVXZHRWY]", "");

}
    public static void main(String[] args) {
        System.out.println(vowelOnly("FGSDFTYUIKdfgtyuiolkjnhbvN"));
    }
}
//use the static, so you do not have to create an instance(object)

