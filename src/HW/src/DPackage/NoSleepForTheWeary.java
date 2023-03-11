package HW.src.DPackage;/*
 * This code does not compile.
 */

import static java.lang.System.out;

class NoSleepForTheWeary {

    public static void main(String args[]) {
        System.out.print("Excuse me while I nap ");
        System.out.println("for just five seconds...");

        takeANap();

        System.out.println("Ah, that was refreshing.");
    }

    static void takeANap() {
//        Thread.sleep(5000);
    }
}
