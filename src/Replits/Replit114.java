package Replits;

public class Replit114 {
    int result;

    int meth(int a, int b) {
        result = a * b;

        return result;
    }

    int meth1(int a, int b) {
        result = a + b;

        return result;
    }

    int meth2(int a, int b) {
        result = a - b;

        return result;
    }

    public static void main(String[] args) {
        Replit114 obj = new Replit114();
        System.out.println(obj.meth(10, 3));
        System.out.println(obj.meth1(10, 20));
        System.out.println(obj.meth2(30, 10));

    }
}
