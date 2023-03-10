package HW.src.DPackage;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.out;

class FindVacancy {

    public static void main(String args[]) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        Scanner diskScanner = new Scanner(new File("Files/GuestList.txt"));
        int hotelCapacity [] = new int[10];
        int suitNumber;

        for (suitNumber = 0; suitNumber < 10; suitNumber++) {
            hotelCapacity [suitNumber] = diskScanner.nextInt();
        }

        suitNumber = 0;
        while (suitNumber < 10 && hotelCapacity [suitNumber] != 0) {
            suitNumber++;
        }

        if (suitNumber == 10) {
            out.println("Sorry, no vacancy");
        } else {
            out.print("How many people for room ");
            out.println(suitNumber);
            out.print("? ");
            hotelCapacity [suitNumber] = keyboard.nextInt();

            PrintStream listOut =
                    new PrintStream("Files/GuestList.txt");

            for (suitNumber = 0; suitNumber < 10; suitNumber++) {
                listOut.print(hotelCapacity [suitNumber]);
                listOut.print(" ");
            }
        }
    }
}
