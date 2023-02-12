package class24;
//Create a class File that will have the following behaviors: open, edit, close. Edit and close are
// implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile,
// PdfFile that will provide specific implementation of open behaviour: Example:
// to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
abstract public class File {
    abstract void open ();
    void edit (){
        System.out.println("edit file by opening the file first ");
    }
    void close (){
        System.out.println("file closes when red x pressed");
    }
}
class JavaFile extends File {

    @Override
    void open() {
        System.out.println("to open .java file we need notepad++");

    }
}
class WordFile extends File {

    @Override
    void open() {
        System.out.println("to open .doc file we need Microsoft word to be installed");

    }
}
class PdfFile extends File {

    @Override
    void open() {
        System.out.println("need PDF installed");
    }
}