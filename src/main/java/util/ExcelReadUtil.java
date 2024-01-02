package util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadUtil {
    public String readExcel(int row, int col) throws IOException {
        String stringValue = null;

        try (FileInputStream fileInputStream = new FileInputStream("Inputfile.xlsx");
             XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream)) {

            XSSFSheet sheet = workbook.getSheetAt(0); // Assuming you want the first sheet

            XSSFCell cell = sheet.getRow(row).getCell(col);
            stringValue = cell.getStringCellValue();
        }

        return stringValue;
    }
}



