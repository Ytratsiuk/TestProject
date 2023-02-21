package class27;

public class ArraysLoop {

    public static void main(String[] args) {
        String name = "Savo";
        String [] array = {"Hiral", "Nima", "Laura", "Nat"};
        System.out.println(findName(array,name));
    }
    public static boolean findName (String []array, String searchName){
        for ( String name: array ){
            if ( name.equalsIgnoreCase(searchName)){
                return true;
            }
        }
return false;
    }
}
