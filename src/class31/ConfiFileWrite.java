package class31;

import class24.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfiFileWrite {
    public static void main(String[] args) throws IOException {
        String path = "Files/test.properties";
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        Properties properties = new Properties();
        properties.setProperty("Name","Anees");
        properties.store(fileOutputStream,"my comment goes here");

    }
}
