package HW.src.encapsulation;

public class TestPerson {
    public static void main(String[] args) {
        Person aPerson = new Person("John", "Doe", "10", "25", 1900, "123-45-6789");
        System.out.println(aPerson.getFirstname());
        System.out.println(aPerson.getLastname());
        aPerson.formatBirthday();
        System.out.println(aPerson.getSsn());
    }

}

