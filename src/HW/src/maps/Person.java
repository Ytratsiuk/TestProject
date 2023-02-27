package HW.src.maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Create a Person class with following private fields: name, lastName, age, salary.
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map that will store key in ascending order.
// In that map store personId and a Person Object. Print each object details.
public class Person {
    private String name;
    private String lastName;
    private int age;
    private int salary;
    public String getName(){
        return  name;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return  age;
    }
    public int getSalary(){
        return  salary;
    }

    Person(String name, String lastName, int age, int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.lastName=lastName;
    }
    void details(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class TestClass{
    public static void main(String[] args) {
        TreeMap<Integer, Person> people = new TreeMap<>();
        people.put(56, new Person("CHRIS", "EVANS", 42, 20));
        people.put(57, new Person("ROBERT", "DOWNEY", 58, 20));
        people.put(58, new Person("JENNIFER", "LAWRENCE", 33, 15));
        people.put(59, new Person("CHANNING", "TATUM", 43, 22));
        Set<Map.Entry<Integer, Person>> allKeysObjects = people.entrySet();
        for (Map.Entry<Integer, Person> info : allKeysObjects) {
            info.getValue().details();
        }
    }
}
