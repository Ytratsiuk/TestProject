package HW.src.project;

//Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
// which should be returning a price of the car. Create 2 sub classes: Sedan and Truck. The Truck class has a field
// as weight and has its own implementation of calculateSalePrice() method in which returned price is calculated as
//following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
// The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): if length of sedan is >20
//feet then returned car price should include 5% discount, otherwise 10% discount
public abstract class Car {
    double carPrice;
    String color;

    abstract double calculateSalePrice();
}

class Sedan extends Car {
    double length;

    Sedan(double carPrice, String color, double length) {
        this.length = length;
        super.carPrice= carPrice;
        super.color=color;
    }

    double calculateSalePrice() {
        if (length > 20) {
            return carPrice - (carPrice * 5 / 100);
        }
        return carPrice - (carPrice * 10 / 100);
    }
}

class Truck extends Car {
    double weight;

    Truck(double carPrice,String color, double weight) {
        this.weight = weight;
        super.carPrice= carPrice;
        super.color=color;

    }

    double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice - (carPrice * 10 / 100);
        }
        return carPrice - (carPrice * 20 / 100);
    }
}

class TeestingCar {
    public static void main(String[] args) {
        Sedan car1 = new Sedan(4500,"White", 15);
        Truck car2 = new Truck(4500, "Green",1000);
        System.out.println(car1.calculateSalePrice());
        System.out.println(car2.calculateSalePrice());

    }
}

