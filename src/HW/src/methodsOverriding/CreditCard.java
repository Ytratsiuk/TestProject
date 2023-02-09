package HW.src.methodsOverriding;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    double balance, interest, rate;

    double interestIs(double balance, double rate) {
        return interest = balance * rate / 100;
    }

}

class Visa extends CreditCard {

}

class AX extends CreditCard {
    double bankFee;

    double interestIs(double balance, double rate, double bankFee) {
        return interest = balance * rate / 100 - bankFee;
    }
}

class TestCreditCard {
    public static void main(String[] args) {
        CreditCard obj1 = new CreditCard();
        Visa obj2 = new Visa();
        AX obj3 = new AX();
        System.out.println(obj1.interestIs(3000, 2.5));
        System.out.println(obj2.interestIs(3000, 2.5));
        System.out.println(obj3.interestIs(3000, 2.5, 5));
    }
}
