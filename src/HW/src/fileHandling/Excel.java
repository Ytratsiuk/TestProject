package HW.src.fileHandling;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel {
    public static void main(String[] args) {
        String path = "Files/DATA.xlsx";
        try {
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook xssf = new XSSFWorkbook(fis);
            Sheet sheet1 = xssf.getSheet("Sheet1");
            int noOfRows = sheet1.getPhysicalNumberOfRows();

            for ( int i = 0; i< noOfRows; i++){
                Row row =  sheet1.getRow(i);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
