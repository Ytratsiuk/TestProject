package HW.src.arrayList;

//Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as
// getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as
// carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
// Using for loop/advanced for loop/ iterator access all methods of the class.
// Create a Card class that will have interest rate field and card type
//  and a constructor that will initialize the fields.
//  Create 3 objects of different card and store them into LinkedList.
//  Using for loop/advanced for loop/ iterator access all methods of the class.
public abstract class Insurance {
    String insuranceName;

    abstract void getQuote();

    abstract void cancelInsurance();
}
class Car extends  Insurance{
    String carModel;

    @Override
    void getQuote() {
        System.out.println(carModel+"' quote is $129 per month");
    }

    @Override
    void cancelInsurance() {
        System.out.println(carModel+"' insurance is canceled");
    }
}
class Pet extends  Insurance{
    String petType;

    @Override
    void getQuote() {
        System.out.println(petType+"' quote is $20 per month");
    }

    @Override
    void cancelInsurance() {
        System.out.println(petType+"' insurance is canceled");
    }
}
class Health extends  Insurance{

    @Override
    void getQuote() {
        System.out.println("Your insurance is $500 per month");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Your insurance is canceled");
    }
}