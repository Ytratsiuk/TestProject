package arraysMW;

public class ArrayCars {
    public static void main(String[] args) {
        //Create an array that can store names of cars and store 6 elements into it. Print all values from the array.
        String car[] =  {"Toyota", "BMW", "Mercedes", "Honda","Jaguar", "Lexus",};
        for(int i=0; i<car.length; i++){
            System.out.println(car[i]);
        }
    }
}
