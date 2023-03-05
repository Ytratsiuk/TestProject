package class32;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo9 {
    public static void main(String[] args) throws IOException {

        List<Map<String, String>> excelData = ExcelReader.read();
        for (Map<String, String> eachMap : excelData) {
            for (Map.Entry<String, String> eachKeySet : eachMap.entrySet()) {
                System.out.println(eachKeySet.getKey() + "\t" + eachKeySet.getValue());
            }
            System.out.println(" ********");
        }

    }
}