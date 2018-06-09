package com.amazon.AutomationFramework.Pages.Base;

import com.amazon.AutomationFramework.Selenium.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Product_Page {

    public static void AddCart(){
        WebElement addToCart = Driver.Instance.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        addToCart.click();
        Assert.assertEquals(Driver.Instance.findElement(By.xpath("//h1[@class='a-size-medium a-text-bold']")).getText(),"Added to Cart");
    }
}
