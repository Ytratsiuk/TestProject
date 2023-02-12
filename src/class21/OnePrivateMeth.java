package class21;

import class1.Main;

public class OnePrivateMeth {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    private int privatMeth(int a, int b) {
        return a + b;
    }

    private  int privatMeth(int a, int b, int c) {
        return a - b - c;
    }

    private double privatMeth(double b, int a) {
        return a / b;
    }

     public static void main(String[] args) {
        OnePrivateMeth obj = new OnePrivateMeth();
         System.out.println(obj.privatMeth(4,3,9));
    }
}
