package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class NewConfig {
    public static void main(String[] args) throws IOException {
        String path = "Files/config2.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        properties.setProperty("name", "yuliya");
        properties.setProperty("last name", "tratsiuk");
        properties.setProperty("age", "26");
        properties.setProperty("location", "denver");
        properties.store(fileOutputStream, "I CREATED A CONFIG PROPERTY FILE");
    }
}
