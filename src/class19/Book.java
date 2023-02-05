package class19;

public class Book {

    String author;
    String title;
    int year;

    Book(String author,String title){
        this.author=author;
        this.title=title;
    }
    Book(String author,String title,int year){
        this(author,title);
        this.year=year;
    }
    void info(){
        System.out.println("Author:"+author+", Title: "+title+", published: "+year);
    }

    public static void main(String[] args) {

        Book book =new Book("Judy Kerolus", "Java Priciples", 2023 );
        book.info();
    }
}