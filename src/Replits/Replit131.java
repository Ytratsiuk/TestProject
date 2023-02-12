package Replits;

import static Replits.Replit131.thirdLetter;

public class Replit131 {
    static String thirdLetter(String s) {
        String output= "";
        for (int i = 0; i < s.length(); i += 3) {
            output = output+s.charAt(i);
        }
        return output;
    }

}
class Tester1 {

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
