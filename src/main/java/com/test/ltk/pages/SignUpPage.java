package com.test.ltk.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.jar.Attributes;


public class SignUpPage {

    public SignUpPage(WebDriver driver) {


        PageFactory.initElements(driver, this);


    }


    @FindBy(name = "email")
    WebElement emailClick;

}