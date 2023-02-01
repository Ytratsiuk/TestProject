package Replits;

/*Validate if the string ends with "u" prints the boolean value accordingly.

        Validate if the string ends with "world" prints the boolean value accordingly.

        Validate if the string ends with "are" prints the boolean value accordingly.

        Validate if the string ends with "you" prints the boolean value accordingly.*/
public class Repli {
    public static void main(String[] args) {
        String str = "hello how are you";
        boolean check = true;
        if (str.endsWith("u")) {
            System.out.println(check);
        } else {
            System.out.println(!check);
        }
        if (str.endsWith("world")) {
            System.out.println(check);
        } else {
            System.out.println(!check);
        }
        if (str.endsWith("are")) {
            System.out.println(check);
        } else {
            System.out.println(!check);
        }
        if (str.endsWith("you")) {
            System.out.println(check);
        }else{
                System.out.println(!check);
            }
        }
    }
