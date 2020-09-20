package com.csg.flipkart_generics;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadAndWriteToExcel {
    public static String dir;
    public static String filePath;
    public static  String fileName;

    public void readFromExcel() {
        dir = System.getProperty("user.dir");
        fileName = "\\data.xlsx";
        filePath = dir + fileName;
        System.out.println("Excel File Path : " + filePath);

        File src = new File(filePath);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(src);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            XSSFWorkbook ExcelWBook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        XSSFSheet ExcelWSheet = new ExcelWBook.getSheet(SheetName);



    }

}
