package class16HW;

public class VowelsPrivate {
//Create a method that will accept a String as a parameter
// and return a new String that consist only of vowels.
// Method should be available inside the class only where
// it was declared and executed by calling it is name.
 private String vowelOnly (String phrase){
     StringBuilder newPh= new StringBuilder(phrase);
    String output = phrase.replaceAll("[aeiou]", "");

    return output;
}
    public static void main(String[] args) {
        VowelsPrivate see=new VowelsPrivate();
        System.out.println(see.vowelOnly("aeipoywb"));
    }
}

