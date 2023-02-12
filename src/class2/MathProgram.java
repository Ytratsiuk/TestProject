package class2;

public class MathProgram {
    public static void main(String[] args) {
        float number1=50.44f;
        float number2= 100.2F;
        float sum=number1+number2;
        float sub=number1-number2;
        float mult=number1*number2;
        float div=number1/number2;
        System.out.println("The Addition of 2 numbers "+number1+" and "+number2+" is equal to "+sum);
        System.out.println("The Subtraction of 2 numbers "+number1+" and "+number2+"is equal to "+sub);
        System.out.println("The Multiplication of 2 numbers "+number1+" and "+number2+" is equal to "+mult);
        System.out.println("The Division of 2 numbers "+number1+" and "+number2+" is equal to "+div);
        float number3=3.9f;
        float square=number3*number3;
        double square2=Math.pow(number3,2);
        System.out.println("The square of "+number3+" is "+square);




    }
}
