package HW.src;

public class averageInArray {
    // final method avgElements averages all the elements in an integer array
    static final double avgElements(int[] a){
        double sum = 0;
        double average = 0;
        int count = 0 ;
        for ( int i = 0; i < a.length; i++){
            sum = sum + a[i];
            count++;
            average = sum / count ;
        }
        return average;
    }

    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
}
