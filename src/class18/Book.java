package class18;

public class Book {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed*/
    String title, author,edition;
    int pages, year;
    Book (String title,String author, int year){
        this.author=author;
        this.title=title;
        this.year=year;
        System.out.print(title+" is written by "+ author+" in "+year+". ");
    }
    Book (String title,String author, int pages, String edition, int year){
        this(title, author,year);
        this.pages=pages;
        this.edition=edition;
        System.out.println("The book of "+edition+" edition has "+pages+" pages.");
    }

    public static void main(String[] args) {
        Book bookOne = new Book("War and Peace","Leo Tolstoy", 1225, "first", 1869);
    }
}
