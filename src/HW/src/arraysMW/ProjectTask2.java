package arraysMW;

import java.util.Scanner;

public class ProjectTask2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String countries[] = new String[6];
        countries[0] = keyboard.next();
        countries[1] = keyboard.next();
        countries[2] = keyboard.next();
        countries[3] = keyboard.next();
        countries[4] = keyboard.next();
        countries[5] = keyboard.next();
        for (int i = 0; i < countries.length; i++) {
            switch (countries[i]) {
                case "USA":
                    System.out.println(countries[i]+" DC");
                    break;
                case "Turkey":
                    System.out.println(countries[i]+" Ankara");
                    break;
                case "Israel":
                    System.out.println(countries[i]+" Jerusalem");
                    break;
                case "Syria":
                    System.out.println(countries[i]+" Damascus");
                    break;
                case "Lebanon":
                    System.out.println(countries[i]+" Berut");
                    break;
                case "Egypt":
                    System.out.println(countries[i]+" Cairo");
                    break;
                case "Sudan":
                    System.out.println(countries[i]+" Khartoum");
                    break;
                case "Morocco":
                    System.out.println(countries[i]+" Rabat");
                    break;
                case "Libya":
                    System.out.println(countries[i]+" Tripoli");
                    break;

            }
        }
    }
}