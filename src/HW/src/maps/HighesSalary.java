package HW.src.maps;
//Create a Map that will store Employee name and salary.
//Write a logic to retrieve the employee who gets the highest salary. Output should be in the below format
//John Smith = $100000
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HighesSalary {
    public static void main(String[] args) {
        TreeMap<String, Long> employees = new TreeMap<>();
        employees.put("Bill Gates", 36100000000l);
        employees.put("Warren Buffet", 13100000000l);
        employees.put("Jeff Bezos", 37666666667l);
        employees.put("Mark Zuckerberg", 8766666667l);
        employees.put("Steve Ballmer", 7525000000l);
        employees.put("Bill Gates ", 7500000000l);
        Set<Map.Entry<String, Long>> allKV = employees.entrySet();
        long max = 0;
        String rich = "";
        for (Map.Entry<String, Long> employee : allKV) {
            if (employee.getValue() > max) {
                max = employee.getValue();
                rich = employee.getKey();
            }
        }
        System.out.println(rich + " = $"+max);
    }
}
