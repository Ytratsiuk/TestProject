package HW.src.exceptions;
//Create a static method that will return a List of Exceptions.
//Inside your method create objects of 4 exception classes using try and catch blocks and store
// them inside your list.
//Call your method inside main and print name and details of all Exception objects.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static HW.src.exceptions.ListOfExceptions.aListOfExceptions;

public class ListOfExceptions {
    public static List<Exception> aListOfExceptions() {
        List<Exception> list = new ArrayList<>();
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);

            try {
                int a = 20 / 0;
            } catch (ArithmeticException e) {
                // e.printStackTrace();
                // Prints what exception has been thrown
                System.out.println(e);

                try {
                    String path = "Files/Book9.xlsx";
                    FileInputStream fis = new FileInputStream(path);
                } catch (FileNotFoundException exc) {
                    System.out.println(exc);
                    try {
                        String myString = null;
                        myString.length();
                    } catch (NullPointerException except) {
                        System.out.println(except);
                        list.add(ex);
                        list.add(e);
                        list.add(exc);
                        list.add(except);
                    }
                }
            }
        }
        return list;
    }
}

class Test {
    public static void main(String[] args) {
        aListOfExceptions();

    }
}

