package HW.src.DPackage;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.out;

class FindVacancy {

    public static void main(String args[])
            throws IOException {
        Scanner keyboard = new Scanner(System.in);
        Scanner diskScanner = new Scanner(new File("Files/GuestList.txt"));
        int guests[] = new int[10];
        int room;

        for (room = 0; room < 10; room++) {
            guests[room] = diskScanner.nextInt();
        }

        room = 0;
        while (room < 10 && guests[room] != 0) {
            room++;
        }

        if (room == 10) {
            out.println("Sorry, no vacancy");
        } else {
            out.print("How many people for room ");
            out.println(room);
            out.print("? ");
            guests[room] = keyboard.nextInt();

            PrintStream listOut =
                    new PrintStream("Files/GuestList.txt");

            for (room = 0; room < 10; room++) {
                listOut.print(guests[room]);
                listOut.print(" ");
            }
        }
    }
}
