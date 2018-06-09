package com.amazon.AutomationFramework.Pages.Base;

import com.amazon.AutomationFramework.Selenium.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Results_Page {

    public static void SelectFirstResult(){
        WebElement firstResult = Driver.Instance.findElement(By.xpath("//div[@id='resultsCol']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]"));
        firstResult.click();
    }
}
