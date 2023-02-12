package HW.src.stringMethod;
/*Create a String and print it in reverse order (Sunday → yadnuS).*/
public class Reverse1 {
    public static void main(String[] args) {
        String str = "Sunday";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println(reverse);
        Reverse letUseTheMethodReverse = new Reverse();
        System.out.println(letUseTheMethodReverse.letsReverse("Sunday"));
    }
}
        //another way
       /* String str="sunday";
        for(int i=5; i>=0;i--){
            System.out.print(str.charAt(i));
        } */

