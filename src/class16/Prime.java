package class16;

public class Prime {
    boolean isPrime ( int number ){
        boolean flag=true;
        if ( number > 1){
        for( int i = 2; i<=number; i++) {
            if(number%i==0){
                flag=false;
                break;
            }
        }
        }else{
            flag=false;
        }
        return flag;
    }

    public static void main(String[] args) {
        Prime object  = new Prime();
        System.out.println(object.isPrime(6));
    }
}
