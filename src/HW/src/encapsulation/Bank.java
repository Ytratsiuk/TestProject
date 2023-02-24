package HW.src.encapsulation;

public class Bank {
    public static void main(String[] args) {
        Customer one = new Customer();
        one.setName("Yuliya Tratsiuk");
        one.setSsn(346786789);
        System.out.println("Name of the customer is " + one.getName());
        System.out.println("SSN of " + one.getName() + " is " + one.getSsn());
        PrivateClient two = new PrivateClient("Mariana Ferrari", "123-46-3456" );
        System.out.println("Name of the private customer is " + two.getName());
        System.out.println("SSN of " + two.getName() + " is " + two.getSsn());
    }
}
