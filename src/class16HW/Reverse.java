package class16HW;

public class Reverse {
    //2) Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
    String letsReverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        String output = reversed.reverse().toString();
        return output;
    }

    public static void main(String[] args) {
        Reverse letsSeeReverse = new Reverse();
        System.out.println(letsSeeReverse.letsReverse("Sunday used to be a funday!"));

    }
}
