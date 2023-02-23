package HW.src.arrayList;

import java.util.ArrayList;

//Create an arraylist of cars and retrieve all the values using 3 different ways.
public class retriveValue {
    public static void main(String[] args) {
        ArrayList<String> garage = new ArrayList<>();
        garage.add("Toyota");
        garage.add("BMW");
        garage.add("Honda");
        garage.add("Mercedes");
        garage.add("Volvo");
        garage.add("Tesla");
        for (String cars : garage) {
            System.out.print(cars + " ");
        }
        System.out.println();
        System.out.println(garage);

        for (int i = 0; i < garage.size(); i++) {
            System.out.print(garage.get(i) + " ");
        }
    }
}
