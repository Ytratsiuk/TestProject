package class3;

public class ConvertingCasting {
    public static void main(String[] args) {
        long number=100;
        byte b=10;
        int number2=b;
        short c=(short)number;
        System.out.println(c);

 float eggs=12.5f;
 int wholePart=(int)eggs;
        System.out.println(wholePart);

        int num1,num2;
        num1=20;
        num2=30;
        System.out.println(num1>num2);    // relational operators--true or false result!
        System.out.println(num1<num2);
        System.out.println(num1!=num2);    // is num1 not equal to num2---true
        System.out.println(num1==num2);    // is num1 equal to num2 ------false
        System.out.println(num1>=num2);    // grater or equal------------false
        System.out.println(num1<=num2);    // grater or equal-----------true


        System.out.println(num1+num2);    // arithmetical operators give you a result
        System.out.println(num1-num2);
        System.out.println(num1%num2);    // module
        System.out.println(num1*num2);
        System.out.println(num1/num2);






    }
}
