package class6;

public class LogicalAndOperator {
    public static void main(String[] args) {
        String pasword="1245";
        System.out.println(pasword.equals("12345")); //check if paswoard equals to something
        if (!pasword.equals("12345")){
            System.out.println("wrong password");
        }
    }
}
