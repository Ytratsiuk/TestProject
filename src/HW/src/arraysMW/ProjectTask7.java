package arraysMW;

public class ProjectTask7 {
    //Write a java program to check whether a given number is prime or not?
    public static void main(String[] args) {
        int num[][] = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {11, 1, 2, 13, 14, 15, 16, 17, 18, 19, 20}, {21, 22, 23, 24, 25, 26, 27, 28, 29, 30}};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] == 0 || num[i][j] == 1) {
                } else {
                    for (int a = 2; j < num[i].length; a++) {
                        if (num[i][j] % a != 0) {
                            System.out.println(num[i][j] + " is prime number");
                        }
                        break;
                    }
                    }
                }
            }
        }
    }

    /*int i,m=0,flag=0;
    int n=3;//it is the number to be checked
    m=n/2;
  if(n==0||n==1){
        System.out.println(n+" is not prime number");
    }else{
        for(i=2;i<=m;i++){
            if(n%i==0){
                System.out.println(n+" is not prime number");
                flag=1;
                break;
            }
        }
        if(flag==0)  { System.out.println(n+" is prime number"); }
    }//end of else
}
} */