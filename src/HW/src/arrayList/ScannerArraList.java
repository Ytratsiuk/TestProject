package HW.src.arrayList;
//Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
import java.util.ArrayList;
import java.util.Scanner;

public class ScannerArraList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> elements = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            elements.add(input.nextInt());
        }
        for (int el : elements) {
            System.out.print(el + " ");
        }
    }
}
