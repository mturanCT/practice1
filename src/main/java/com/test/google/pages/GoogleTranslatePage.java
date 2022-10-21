package com.test.google.pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class GoogleTranslatePage {


    public void Translator() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://translate.google.com/");
        driver.manage().window().maximize();
        WebElement sourceLanguage = driver.findElement(By.xpath("//div[@class=\"aCQag\"]//following-sibling::button[@jsname=\"RCbdJd\"]"));
        sourceLanguage.click();
        Thread.sleep(500);

        List<WebElement> selectedLanguageAlbanian = driver.findElements(By.xpath("//c-wiz[@jsrenderer=\"Sx55ld\"]//div[.=\"Albanian\"]"));
        selectedLanguageAlbanian.get(0).click();
        WebElement textArea = driver.findElement(By.xpath("//div//textarea"));
        textArea.sendKeys("përshëndetje");
        Thread.sleep(500);
        List<WebElement> translationLanguageArrow = driver.findElements(By.xpath("//div[@class=\"akczyd\"]//button[@jsname=\"zumM6d\"]"));
        translationLanguageArrow.get(0).click();


        WebElement italian = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/c-wiz/div[2]/div/div[3]/div/div[2]/div[55]"));
        Thread.sleep(500);
        italian.click();



    }
}