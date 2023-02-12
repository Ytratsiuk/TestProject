package class24;

public abstract class Animal {
   abstract void speak();
    abstract void eat();
    void sleep(){
        System.out.println("Animals sleep 5 to 8 hours a day");
    }
    static class Dog extends Animal{


        @Override
        void speak() {
            System.out.println("bark bark");
        }

        @Override
        void eat() {
            System.out.println("eats bones");

        }
    }
    static class Cat extends Animal{


        @Override
        void speak() {
            System.out.println("mew mew");
        }

        @Override
        void eat() {
            System.out.println(" eats fish");

        }
    }

}
