package com.test.google.pages;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



    public  class ExcelPoi {


        Workbook workbook;

        public ExcelPoi(WebDriver driver) {

        }

        @Test

        public void readData1() throws IOException, InterruptedException {

            File excelFile = new File("C:/Users/dayub/Desktop/GoogleTranslator.xlsx");
            FileInputStream fileInputStream = new FileInputStream(excelFile);

            //getting whole excel structure
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            //get first sheet
            Sheet sheet = workbook.getSheet("Sheet1");

            //get first row  "C:\Users\dayub\Desktop\GoogleTranslator.xlsx"
            Row row2 = sheet.getRow(0);
            Row row3 = sheet.getRow(1);
            Row row4 = sheet.getRow(2);
            Row row5 = sheet.getRow(3);

            //get first cell/column
            Cell cell1 = row2.getCell(1);
            Cell cell2 =row3.getCell(1);
            Cell cell3 = row4.getCell(1);
            Cell cell4 = row5.getCell(1);

            String sourceLanguage = cell1.toString();
            String translationLanguage = cell2.toString();
            String initialText =cell3.toString();
            String result = cell4.toString();
            Assert.assertEquals("Albanian", sourceLanguage);
            Assert.assertEquals("Italian",translationLanguage);
            Assert.assertEquals("përshëndetje",initialText);
            Assert.assertEquals("ciao",result);





        }

        public void ts(String sourceLanguage, String translationLanguage,String intialText,String result) {

        }
    }


