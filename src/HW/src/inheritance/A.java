
package class18HW;

public class A {
    //multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    String a;
    int b, c, d;

    A(int b, int c, int d, String a) {
        System.out.println(a + (b + c + d));
    }

}

class B extends A {
    B(int b, int c, int d, String a) {
        super(b, c, d, a);
    }
}

class C extends B {
    C(int b, int c, int d, String a) {
        super(b, c, d, a);
    }
}
