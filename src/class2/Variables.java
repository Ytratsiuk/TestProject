package class2;

public class Variables {
    public static void main(String[] args) {
        /*below line is representing a box in a computer's memory.
        we are calling it box1 if we need the inf that we are storing inside the box
        we can simply say to the computer dive us the contents of box1
        int=> what type of data we want to store
        box1=> is the name
        = sign will take whatever we write after and store it inide the box1
         */
        int box1=10;
        //we don't need "" if we are printing something from a box
        System.out.println(box1);// bring the cotents of box1 and print them on the console!
        byte box2=127;
        byte box3=-128;
        short box4=32767;
        short box5=-3256;
        int biggerbox=123456789;
        long maxbox=1567890456789l;
        System.out.println(box2);
        short mybox=10000;
        System.out.println(mybox);
    }
}
