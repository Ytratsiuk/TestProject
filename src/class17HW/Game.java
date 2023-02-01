package class17HW;

public class Game {
    //3) Write a java class that have 4 constructors with 4 different access levels
    // of constructors(private,public,default,protected) and create 4 objects of this class: 1 -
    // inside same class; 2 - from outside the class; 3 - from different class inside different package
    // and observe result.
    String name;
    int duration;
    byte players;
    boolean portability;
    String difficulty;
    void printInfo(){
        System.out.println(name);
    }

    private Game(String name) {
        this.name = name;
        System.out.println("let's play " + name);
    }

    public Game(byte players, String difficulty) {
        this.players = players;
        this.difficulty = difficulty;
    }

    Game(boolean portability) {
        this.portability = portability;
        System.out.println("the game is portable: " + portability);
    }

    protected Game(int duration) {
        this.duration=duration;
        System.out.println(duration+" minutes long");
    }

    public static void main(String[] args) {
        Game one = new Game("Jenga");
        Game two = new Game (20);

    }
}
