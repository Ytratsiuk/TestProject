package HW.src.stringMethod;

public class Reverse {
    //a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
    public String letsReverse(String input) {
        StringBuilder toReverse = new StringBuilder(input);
        return toReverse.reverse().toString();
    }

    public static void main(String[] args) {
        Reverse letsSeeItReversed = new Reverse();
        System.out.println(letsSeeItReversed.letsReverse("Sunday used to be a fun day! Not it is a Java studying day"));

    }
}
