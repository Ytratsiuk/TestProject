package Replits;

public class Replit107 {
    //Replace all instances of given character with a "*" within the given String.
    String censorLetter(String in, char put) {
        StringBuilder strb = new StringBuilder(in.replace(put,'*'));
String anotherOne=strb.toString();
        return anotherOne;
    }

    public static void main(String[] args) {
        Replit107 obj = new Replit107();
        System.out.println(obj.censorLetter("dfghjkl", 'g'));
    }

}

