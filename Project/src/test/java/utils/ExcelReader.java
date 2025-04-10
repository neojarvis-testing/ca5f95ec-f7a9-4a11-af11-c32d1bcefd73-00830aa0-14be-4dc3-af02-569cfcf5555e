package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

public class ExcelReader {
    public static FileInputStream file = null;
    public static XSSFWorkbook workbook = null;
    public static String cellValue = null;

    public static String readCellValue(String sheetName, String key, String columnName) {
        String filePath = System.getProperty("user.dir") + "/excel/testdata.xlsx";

        try {

            file = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            XSSFRow headerRow = sheet.getRow(0);
            int keyColumnIndex = -1;
            int targetColumnIndex = -1;

            for (Cell cell : headerRow) {
                String cellValueHeader = cell.getStringCellValue().trim();
                if (cellValueHeader.equalsIgnoreCase("id")) {
                    keyColumnIndex = cell.getColumnIndex();
                }
                if (cellValueHeader.equalsIgnoreCase(columnName)) {
                    targetColumnIndex = cell.getColumnIndex();
                }
                Assert.assertTrue(keyColumnIndex != -1, columnName + " nor present in " +
                        sheetName + " sheet");
            }
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                XSSFRow row = sheet.getRow(i);
                if (row != null) {
                    Cell keyCell = row.getCell(keyColumnIndex);
                    if (keyCell != null && keyCell.getStringCellValue().trim().equalsIgnoreCase(key)) {
                        Cell targetCell = row.getCell(targetColumnIndex);
                        if (targetCell != null) {
                            cellValue = targetCell.toString();
                            break;
                        }
                    }
                }
            }

        } catch (IOException e) {
            LoggerHandler.infoMessage("Error reading the file: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            LoggerHandler.infoMessage("Error with data: " + e.getMessage());
        } finally {
            try {
                workbook.close();
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return cellValue;
    }

    public static List<String> readExcelData(String sheetName, String columnName) {
        List<String> data = new ArrayList<>();
        try {
            String filePath = System.getProperty("user.dir") + "/excel/testdata.xlsx";
            FileInputStream fis = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            Row headerRow = sheet.getRow(0);
            int columnIndex = -1;
            for (Cell cell : headerRow) {
                if (cell.getStringCellValue().equalsIgnoreCase(columnName)) {
                    columnIndex = cell.getColumnIndex();
                    break;
                }
            }
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);

                Cell cell = row.getCell(columnIndex);
                data.add(cell.getStringCellValue());
            }
            workbook.close();
            fis.close();
        } catch (IOException e) {
            LoggerHandler.infoMessage("Error reading Excel file: " + e.getMessage());
        }
        return data;
    }

}
