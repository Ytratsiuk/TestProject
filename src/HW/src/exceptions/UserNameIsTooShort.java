package HW.src.exceptions;

import java.util.Scanner;

//Create a method checkUserName that will throw a runtime exception.
// Method should throw an exception when entered username is less than 5 characters.
public class UserNameIsTooShort extends Exception {
    UserNameIsTooShort (String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = scan.nextLine();
        try {
            if (username.length() < 5) {
                throw new UserNameIsTooShort("Username should be more than 5 characters");
            }
        }
            catch (UserNameIsTooShort e){
        }
    }
}
