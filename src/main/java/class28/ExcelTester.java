package class28;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelTester {
    public static void main(String[] args) throws IOException {

        List<Map<String,String>> data = ExcelReader.readExcelData("C:\\Users\\Marko\\IdeaProjects\\JavaProject\\Files\\Sales.xlsx");
        System.out.println(data);
    }
}
