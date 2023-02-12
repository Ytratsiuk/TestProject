package HW.src.polimorfism;

abstract public class Computer {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each object and execute available methods.
    public static void main(String[] args) {
        Computer[] computers = {new Apple(), new HP()};
        for (Computer computer : computers) {
            computer.playVideo();
            computer.browserInternet();
            computer.installApps();
            if (computer instanceof Apple) { // we are checking if the variable c contains the object of an Apple class
                Apple apple = (Apple) computer; // converting the variable c back to an apple object
                apple.editVideos();
            }
        }
    }

    int RAM;
    int storage;
    String OS;

    abstract void playVideo();

    abstract void browserInternet();

    abstract void installApps();
}

class Apple extends Computer {
    @Override
    void playVideo() {
        System.out.println("Playing the video on quick time player");
    }

    @Override
    void browserInternet() {
        System.out.println("Browsing the internet using safari");
    }

    @Override
    void installApps() {
        System.out.println("installing the apps from App Store");
    }

    void editVideos() {
        System.out.println("Editing on iMovies");
    }
}

class HP extends Computer {

    @Override
    void browserInternet() {
        System.out.println("Browsing using chrome");
    }

    @Override
    void playVideo() {
        System.out.println("playing the video using VLC player");
    }

    void installApps() {
        System.out.println("You can install any app on me");
    }
}
