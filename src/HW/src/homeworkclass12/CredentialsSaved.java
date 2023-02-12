package homeworkclass12;

import java.util.Scanner;

/*
Store username, password and confirm password from a user and check following requirements:

        Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
        Password should be minimum 8 characters, if less → message=”Password is too short”.
        Password cannot contain username if so, → message=”Password cannot contain username”.
        Password should match confirmed password, if not  → message=“Passwords do not match”.

        Only after all requirements met → message “Your username and password has been created”
*/
public class CredentialsSaved {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your Username");
        String userName = keyboard.nextLine();
        for (int a = 0; ; a++) {
            if (userName.isEmpty()) {
                System.out.println("Username and Password cannot be empty");
                break;
            } else {
                for (int i = 0; ; i++) {
                    System.out.println("Please enter your Password");
                    String password = keyboard.next();
                    if (password.isEmpty()) {
                        System.out.println("Username and Password cannot be empty");
                        break;
                    }
                    if (password.length() < 8) {
                        System.out.println("Password is too short");
                        continue;
                    }
                    if (password.contains(userName)) {
                        System.out.println("Password cannot contain username");
                    }
                    System.out.println("Please confirm your Password ");
                    String passwordConfirm = keyboard.next();
                    if (!passwordConfirm.equals(password)) {
                        System.out.println("Passwords do not match");
                    } else {
                        System.out.println("Your username and password has been created");
                        break;
                    }
                }
                break;

            }
        }
    }
}
