package Replits;

public class Replit122 {
    String nameOfTheCountry;
    String capital;
    int populationSize;

    void printInfo() {
        System.out.println("The capital of " + nameOfTheCountry + " i " + capital + " and population is " + populationSize);
    }

    Replit122(String nameOfTheCountry, String capital, int populationSize) {
        this.nameOfTheCountry = nameOfTheCountry;
        this.capital = capital;
        this.populationSize = populationSize;
    }

    public static void main(String[] args) {
        Replit122 one = new Replit122("USA","Washington DC",7890);
        one.printInfo();
        Replit122 two = new Replit122("Kazahstan", "Astana", 18500000);
        two.printInfo();
    }

}
