package stringMethodMW;

public class VowelsPrivate {
//Create a method that will accept a String as a parameter
// and return a new String that consist only of vowels.
// Method should be available inside the class only where
// it was declared and executed by calling it is name.
 private static String vowelOnly (String phrase){
     return phrase.replaceAll("[aeiou]", "");

}
    public static void main(String[] args) {
        System.out.println(vowelOnly("aeipoywb"));
    }
}
//use the static, so you do not have to create an instance(object)

