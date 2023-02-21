package arraysMW;

public class ProjectTask8 {
    //Write a Java Program to print the first 10 numbers of Fibonacci series.
    public static void main(String[] args) {
        int prev = 0;
        int next=1;
        for (int i = 1; i <=10; i++) {
            System.out.println(prev);
            int temp=prev;
            prev=next;
            next=next+temp;

        }
    }
}
 //0, 1, 1, 2, 3, 5, 8, 13, 21, 34