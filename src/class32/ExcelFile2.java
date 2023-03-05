package class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelFile2 {
    //non-check exception
    public static void main(String[] args) throws IOException {
        String path = "Files/Book1.xlsx";
        FileInputStream fis = new FileInputStream(path);
        //this class comes from apache library jars
        //selenium is written by people, it is free
        XSSFWorkbook xssf = new XSSFWorkbook(fis);
        Sheet sheet2 = xssf.getSheet("Sheet2");

        int noOfRows = sheet2.getPhysicalNumberOfRows();
        List<Map<String, String>> logInData = new ArrayList<>();

        /*for ( int i = 0; i<noOfRows; i++){
            Row row = sheet2.getRow(i);
            System.out.println(row.getCell(0)+" "+row.getCell(1));
        }*/
        Row row0 = sheet2.getRow(0);
        for (int i = 1; i < noOfRows; i++) {
            Row row = sheet2.getRow(i);
            Map<String, String> logInPair = new LinkedHashMap<>();
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                logInPair.put(row0.getCell(j).toString(),row.getCell(j).toString());
                logInData.add(logInPair);
                //prints map by map
                System.out.println(logInPair);
            }
        }
        //prints list of maps
        System.out.println(logInData);
    }
}