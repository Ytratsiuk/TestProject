package HW.src.wrapper;

public class Custom {
    //Creating the custom wrapper class
    private int i;

    Custom(int i) {
        this.i = i;
    }

    public int getValue() {
        return i;
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }
}

//Testing the custom wrapper class
class Test {
    public static void main(String[] args) {
        Custom j = new Custom(10);
        System.out.println(j);
    }
}

