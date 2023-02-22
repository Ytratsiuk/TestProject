package HW.src.project;

//Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
// Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
class TestingTheCode{
    public static void main(String[] args) {
        Circle circle = new Circle(4.9);
        Square square = new Square(5.3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimiter());
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimiter());
    }
}
interface Shape {

    double calculateArea();

    double calculatePerimiter();

}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    final double pi = 3.14159;

    //A=πr2
    @Override
    public double calculateArea() {
        return pi * r * r;
    }

    //C=2πr
    @Override
    public double calculatePerimiter() {
        return 2 * pi * r;
    }
}

class Square implements Shape {
    //A=a2
    double a;

    Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return 2 * a;
    }

    //P=4a
    @Override
    public double calculatePerimiter() {
        return 4 * a;
    }
}
