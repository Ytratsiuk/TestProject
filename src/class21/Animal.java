package class21;

class Animal {
    String color = "Black";
}

class Cat extends Animal {
    String color = "White";

    void printColor() {
        String color = "blue";
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);

    }

}

class AnimalTester {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.printColor();
    }
}