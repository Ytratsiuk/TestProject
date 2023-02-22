package HW.src.ifForSwitchWhile;

public class LoopsFor {
    public static void main(String[] args) {
        // for loop
        // while loop
        for (int i = 0; i < 10; i++) { //++ the same as += 1, after verifying <10, i become i+1
            System.out.println("Counting " + i);
        }
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {  //i want to see all the numbers that divisible by 2
                System.out.println(i+" is the multiple of 2");
            }
        }
    }
}
