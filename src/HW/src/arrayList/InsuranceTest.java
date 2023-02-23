package HW.src.arrayList;

public class InsuranceTest {
    public static void main(String[] args) {
        Car toyota = new Car();
        Pet evee = new Pet();
        Health me = new Health();
        toyota.getQuote();
        toyota.cancelInsurance();
        evee.getQuote();
        evee.cancelInsurance();
        me.getQuote();
        me.cancelInsurance();
    }
}
