package com.test.google.tests;


import io.cucumber.java.bs.A;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



public  class excelPoi  {

WebDriver driver;
    Workbook workbook;

    public excelPoi(WebDriver driver) {

    }

    @Test

    public void readData1() throws IOException  {

        File excelFile = new File("C:/Users/dayub/Desktop/GoogleTranslator.xlsx");
        FileInputStream fileInputStream = new FileInputStream(excelFile);


        Workbook workbook = new XSSFWorkbook(fileInputStream);


        Sheet sheet = workbook.getSheet("Sheet1");


        Row row2 = sheet.getRow(0);
        Row row3 = sheet.getRow(1);
        Row row4 = sheet.getRow(2);
        Row row5 = sheet.getRow(3);


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



}


