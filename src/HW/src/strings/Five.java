package homeworkclass13;
  /* How would you check if String is palindrome or not? aba=> true
           Abbc =>false*/

public class Five {
    public static void main(String[] args) {
        String str = "AbBA";
        String reverse="";
        for ( int i = str.length()-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if ( str.equalsIgnoreCase(reverse)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
