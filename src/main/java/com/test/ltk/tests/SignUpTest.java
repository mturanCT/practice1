package com.test.ltk.tests;

import Utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SignUpTest {

  @Test

    public void SignUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://www.shopltk.com/");
        driver.manage().window().maximize();
        WebElement signUpButton = driver.findElement(By.xpath("//a[@href=\"/signup\"]"));
        signUpButton.click();
        WebElement eMail = driver.findElement(By.name("email"));

        eMail.sendKeys(ConfigReader.readProperty("useremail"));
        WebElement continueButton= driver.findElement(By.xpath("//button[@class=\"v-btn--primary mt-10 v-btn v-btn--block v-btn--has-bg theme--light elevation-0 v-size--default primary ltk-white--text\"]"));
        continueButton.click();
        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        //Thread.sleep(500);

        password.sendKeys(ConfigReader.readProperty("userpassword"));
        WebElement submitButton = driver.findElement(By.xpath("//span[contains(text(),\"sign up to begin shopping\")]"));
        Thread.sleep(500);
        submitButton.click();



      //Alert alert = driver.switchTo().alert();


        //WebElement appBanner = driver.findElement(By.xpath("//i[@class=\"v-icon notranslate mdi mdi-close theme--light\"]"));


       // appBanner.click();
      Thread.sleep(500);

        WebElement discoverPage = driver.findElement(By.linkText("/home"));
        discoverPage.click();



    }
}
