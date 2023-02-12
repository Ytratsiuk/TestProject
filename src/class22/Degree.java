package class22;

public class Degree {/*//Create a class 'Degree' having a method 'getPrerequisite' that prints ""
To get a degree you need high school diploma"".
    Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
    In Masters class override method 'getPrerequisite'.
    Call the method by creating an object of each of the three classes.*/

    String getPrerequisite() {

        return "To get a degree you need high school diploma";
    }
}

class Bachelors extends Degree {

}

class Masters extends Degree {
    String getPrerequisite() {
        return "To get a degree you need brain";
    }
}

class Testing {
    public static void main(String[] args) {
        Degree obj1 = new Degree();
        Bachelors obj2 = new Bachelors();
        Masters obj3 = new Masters();
        System.out.println(obj1.getPrerequisite());
        System.out.println(obj2.getPrerequisite());
        System.out.println(obj3.getPrerequisite());
    }
}