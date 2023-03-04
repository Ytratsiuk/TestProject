package class31;

import class21.Programming;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Exel {
    static public void main(String[] args) throws IOException {
        String path = "Files/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook =new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet1.getRow(1);
        Cell cell = row.getCell(1);
        System.out.println(cell);

    }

}
