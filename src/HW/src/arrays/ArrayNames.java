package HW.src.arrays;

//Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
public class ArrayNames {
    public static void main(String[] args) {
        String name[] = {"Tami", "Sam", "Omir", "Tatiana", "Yuliya"};
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals("Yuliya")) {
                System.out.println(name[i]);
                break;
            }
        }
        String names[] = new String[5];
        names[0] = "tami";
        names[1] = "sam";
        names[2] = "omir";
        names[3] = "tatiana";
        names[4] = "yuliya";
        System.out.println(names[4]);
    }
}
