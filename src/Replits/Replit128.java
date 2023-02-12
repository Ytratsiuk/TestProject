package Replits;

//Then inside method write logic that
// will return the strings combined, one letter at a time, starting with s1
public class Replit128 {
    //look at solution
    static String mixString(String s1, String s2) {
        StringBuilder something = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            something.append(s1.charAt(i)).append(s2.charAt(i));
        }
        return something.toString();
    }

    //test case below (dont change):
    public static void main(String[] args) {
        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);

    }
}
