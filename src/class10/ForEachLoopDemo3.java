package class10;

/*
Limitations of Foreach Loop
 */
public class ForEachLoopDemo3 {
    public static void main(String[] args) {

        int[] arr={10,13,20,25,45,50};
        // We can't update the elements in for each loop because we don't have access to the index;
        // break till 8:54
        for(int x:arr){
            if(x%2!=0){
                x=0;
            }
        }


    }
}
