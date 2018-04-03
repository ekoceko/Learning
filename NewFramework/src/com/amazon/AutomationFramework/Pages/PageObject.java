package com.amazon.AutomationFramework.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    protected WebDriver driver;
    public PageObject(WebDriver driver){
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void dosomething(){

    }
}