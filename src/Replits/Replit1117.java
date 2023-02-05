package Replits;

public class Replit1117 {
    int  sumEvenToX (int x){
        int sum=0;
        for (int i = 1; i <= x; i++){
            if( i % 2 == 0){
                sum=sum+i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
            Replit1117 obj= new Replit1117();
            System.out.println(obj.sumEvenToX(8));
        }
    }

