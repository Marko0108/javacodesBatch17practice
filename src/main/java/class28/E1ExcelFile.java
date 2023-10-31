package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {
        //location of the file
        String path = "C:\\Users\\Marko\\IdeaProjects\\JavaProject\\Files\\Employees.xlsx";
        //class that bring the data in the form of bytes into the memory
        FileInputStream fis = new FileInputStream(path);
        //That special class which knows how to handle excel files
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        //accessing the sheet from the xlsx file
        Sheet sheet= workbook.getSheet("Sheet1");

        Row row=null;
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
             row = sheet.getRow(i);
        }


        for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
            System.out.println(row.getCell(i));                      //last loop results showing only, need nesting loop
                                                                     //overriding previous row
        }

    }
    }

