package class12;

public class StringDemo2 {
    public static void main(String[] args) {
        // only converts the uppler case letters to the lower case
        String str="JAVA is FUN 11352@#$";
        String newStr= str.toLowerCase();
        System.out.println(newStr);

        String str2="i love java";
        String upperCaseLetter=str2.toUpperCase();
        System.out.println(upperCaseLetter);

    }
}
