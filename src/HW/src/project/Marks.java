package HW.src.project;

//We have to calculate the average of marks obtained in three subjects by student A and by
//student B. Create class 'Marks' with an abstract method 'getPercentage' that will be returning
//the average percentage of marks. Provide implementation of abstract method in classes 'A' and 'B'.
// The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects
// as its parameters for student B. Test your code
class Test {
    public static void main(String[] args) {
        A studentA = new A(40, 50, 60);
        System.out.println(studentA.getPercentage());
        B studentB = new B(42, 59, 61, 45);
        System.out.println(studentB.getPercentage());
    }
}

public abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    int mark1, mark2, mark3;

    A(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    double getPercentage() {
        return (mark1 + mark2 + mark3) / 3;
    }
}

class B extends Marks {
    int mark1, mark2, mark3, mark4;

    B(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;

    }

    @Override
    double getPercentage() {
        return (mark1 + mark2 + mark3 + mark4) / 4;
    }
}
