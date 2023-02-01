package Replits;

public class Replit88 {
    String breed;
    String name;
    String color;

    void bark() {
        System.out.println(" can bark");
    }
    void run() {
        System.out.println(" can run");
    }
    void play() {System.out.println(" can play");}

    public static void main(String[] args) {

        Replit88 husky = new Replit88();
        husky.breed = "Husky";
        husky.name = "Kiki";
        husky.color = "white";
        System.out.print(husky.breed);
        husky.play();
        System.out.print(husky.breed);
        husky.bark();
        System.out.print(husky.breed);
        husky.run();

    }
}

