package homeworkArrays;

public class ArraySum {
    //Create an array of size 5 on integers and calculate the sum of all elements in an array.
    public static void main(String[] args) {
        int sum=0;
        int num []=new int [5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;
        for(int i=0; i< num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println(sum);
    }
}
