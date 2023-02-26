package HW.src.class20HW;

public class Shape {
    /*Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code*/
    double r;
    static double pi = 3.14;

    Shape(double r) {
        this.r = r;
    }
}
     class Circle extends Shape {
           //constructor
         Circle (double r){
                super(r);
                double result = (pi * r);
                System.out.println(result);
            }
            //method
         /*double circleArea(double r) {
             double result = (pi * r);
             return result;
         }*/
        }
