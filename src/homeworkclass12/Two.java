package homeworkclass12;
/*) Create a String and print it in reverse order (Sunday → yadnuS).*/


public class Two {
    public static void main(String[] args) {
        String str = "Sunday";
        String reverse="";
        for( int i = str.length()-1; i>=0; i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
        /*String str="sunday";
        for(int i=5; i>=0;i--){
            System.out.print(str.charAt(i));
        } //another way
        str="Sunday";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));*/
    }
}
