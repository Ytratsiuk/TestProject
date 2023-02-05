package Replits;

class Replit94 {
    /*Create a String given="I love Java classes at Syntax"
            - Retrieve 2 Strings using substring method from given String and print them*/
    public static void main(String[] args) {
        String given = "I love Java classes at Syntax";
        int dilim = given.indexOf('c');

        String s1a = given.substring(0, (dilim));
        String sb = given.substring(dilim);
        System.out.println(s1a);
        System.out.println(sb);

    }
}
