package Replits;

public class Replit118 {
    String spaceOut (String s) {
        StringBuilder temp = new StringBuilder();
        for ( int i = 0; i < s.length(); i++){
             temp =temp.append(s.charAt(i));
             temp.append(" ");
        }
        return(temp.toString());
    }

    public static void main(String[] args) {
        Replit118 obj = new Replit118();
        System.out.println(obj.spaceOut("Syntax"));
    }
}