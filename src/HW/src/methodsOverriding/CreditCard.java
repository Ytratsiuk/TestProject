package HW.src.methodsOverriding;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    double balance, rate;

    public CreditCard(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    double interestIs() {
        return this.balance * this.rate / 100;
    }
    double interestIs(double balance, double rate) {
       return balance * rate / 100;
    }

    void pay(double sum) {
        this.balance -= sum;
    }


}

class Visa extends CreditCard {

    public Visa(double balance, double rate) {
        super(balance, rate);
    }
}

class AX extends CreditCard {
    double bankFee;

    public AX(double balance, double rate, double bankFee) {
        super(balance, rate);
        this.bankFee = bankFee;
    }

    double interestIs() {
        return this.balance * this.rate / 100 - this.bankFee;
    }
}

class TestCreditCard {
    public static void main(String[] args) {
//        CreditCard obj1 = new CreditCard();
        Visa obj2 = new Visa(3500, 2.5);
        AX obj3 = new AX(5000, 4.75, 9);
//        System.out.printf("$%4.2f \n", obj1.interestIs());
        System.out.printf("$%.2f \n", obj2.interestIs());
        obj2.pay(500);
        System.out.printf("$%.2f \n", obj2.interestIs());
//        System.out.println(obj3.interestIs(3000, 2.5));
    }
}
