package class21;

public class OneWithStatic {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    static int meth(int a, int b) {
        return a + b;
    }

    static int meth(int a, int b, int c) {
        return a + b - c;
    }

    static double meth(int a, double b) {
        return a + b;
    }
}

class TestIt {
    public static void main(String[] args) {
        OneWithStatic obj = new OneWithStatic();
        System.out.println(obj.meth(6, 9, 8));
        System.out.println(obj.meth(6, 9));
        System.out.println(obj.meth(6, 9.5));
    }
}