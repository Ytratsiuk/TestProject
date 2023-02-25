package class17HW;

public class Book {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed
    int pages;
    String name;
    String author;

    Book(int pages) {
        this.pages = pages;
        author = "Tolkien";
        name = "Lord of the Rings";
    }
    Book(String name1, String author1) {
        name = name1;
        author = author1;
        pages = 9250;
    }
    void printInfo() {
        System.out.println(author + " wrote " + name + " that has " + pages + " pages. ");
    }

    public static void main(String[] args) {
        Book one = new Book(9250);
        Book two = new Book("Lord of the Rings", "Tolkien");
        one.printInfo();
        two.printInfo();

    }
}


