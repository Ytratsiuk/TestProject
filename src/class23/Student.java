package class23;

public class Student {
     void commonBehavior() {
        System.out.println("All students have scheduled classes ");
    }

    void aBehavior() {
        System.out.println("Study hard");
    }

    void anotherBehavior() {
        System.out.println("sleep well");
    }
}

class SyntaxStudent extends Student {
    void specificBeh (){
        System.out.println("syntax student");
    }
    @Override
    void aBehavior() {
        System.out.println("Study hard with no breaks");
    }
}


class CollegeStudent extends Student {
void specificBeh (){
    System.out.println("college student");
}
    @Override
    void anotherBehavior() {
        System.out.println("college students sleep 5 hours");
    }
}

class SchoolStudent extends Student {
    void specificBeh (){
        System.out.println("school student");
    }
    @Override
    void aBehavior() {
        System.out.println("school students study hard sometimes");
    }
}



