package HW.src.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args) {
        String path ="Files/config2.properties";
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties prpts = new Properties();
            prpts.load(fis);
        } catch (FileNotFoundException e) {
            System.out.println("something went wrong");

        } catch (IOException e) {
            System.out.println("II exception occurred");
        }

    }
}
