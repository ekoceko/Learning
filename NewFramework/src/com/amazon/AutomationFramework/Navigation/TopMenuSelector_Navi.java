package com.amazon.AutomationFramework.Navigation;

import com.amazon.AutomationFramework.Selenium.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TopMenuSelector_Navi {
    static String menuName;
    static String SubLinkTitle;

    static void SuperSelect(String SubLinkTitle){
        Driver.Instance.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'"+SubLinkTitle+"')]")).click();
        Driver.Wait(1);
    }
    static void HoverOnMenu(String menuname){
        System.out.println("current menu name isx: "+ menuname);
        WebElement hoverOnElement =  Driver.Instance.findElement(By.xpath("//a[@id='nav-link-"+ menuname +"']"));
        Actions actions = new Actions(Driver.Instance);
        actions.moveToElement(hoverOnElement).perform();
        Driver.Wait(1);
    }
    static void HoverOnSubMenu(String SubMenuName){
        WebElement hoverOnElement =  Driver.Instance.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'"+SubMenuName+"')]"));
        Actions actions = new Actions(Driver.Instance);
        actions.moveToElement(hoverOnElement).perform();
        Driver.Wait(1);
    }
}



