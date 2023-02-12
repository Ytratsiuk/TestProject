package class3;

public class VariablesDemo1 {
    public static void main(String[] args) {
        int num,salary,money,revenue,profit; //only creates a box without assigning a value
                                            // we can create multiple empty boxes in single line
        num=10;
        revenue=50000;              //updating the value/ assigning a value to the variable
        salary=12000;
        System.out.println(""+revenue+salary); //when I want to print the values without adding introduce "" so it will treat as a String
        System.out.println(revenue-salary);    //performs subtraction
revenue-=salary;                               //not the same as  System.out.println(revenue-salary)!! here i updated revenue variable, it is 38,000 now
        profit=revenue-num;                    //here I calculate profit: revenue is now updated to 38,000 and we substract additional 10
        System.out.println(revenue);
        System.out.print("Profit equals $"); System.out.println(profit); //first print without LN to print the following print on the same line.
        System.out.println(profit);
        String name,city,country;
        char gender,letter;
        name="maria";              //don't forget "" when assigning a word, sentence to String!!!
        gender='F';               //don't forget ' ' when assigning a character to char!!!
        System.out.println(gender+" "+name);
    }
}
