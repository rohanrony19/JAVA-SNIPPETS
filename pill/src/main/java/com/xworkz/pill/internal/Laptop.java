package com.xworkz.pill.internal;

import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Laptop {

    public  void excelRead() throws IOException {

        String path="C:\\Users\\rohan\\OneDrive\\Documents\\JAVA-SNIPPETS\\JAVA-SNIPPETS\\pill\\src\\main\\resources\\sample_excel.xlsx";
        FileInputStream inputStream=new FileInputStream(path);

        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
        XSSFSheet sheet= workbook.getSheet("sheet1");

        int rows= sheet.getLastRowNum();
        int cols=sheet.getRow(1).getLastCellNum();
 
        for(int r=0; r<rows; r++){
           XSSFRow row =sheet.getRow(r);
            for (int c=0; c<cols;c++){
                XSSFCell cell= row.getCell(c);

                switch (cell.getCellType()){
                    case STRING:
                        System.out.println(cell.getStringCellValue() +"/t");break;
                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue()+"/t");break;
                }
            }
            System.out.println();
        }





    }
}
