package com.test.google.tests;


import com.test.google.pages.ExcelPoi;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;



public class GoogleTranslateTest {

    WebDriver driver;

  @Test

    public void  Translation()  throws IOException  {

       GoogleTranslateTest translate = new GoogleTranslateTest();
       translate.Translation();
      ExcelPoi excelData=new ExcelPoi(driver);
       excelData.readData1();




    }
}
