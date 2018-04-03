package com.amazon.AutomationFramework.Pages;

import com.amazon.AutomationFramework.Selenium.Driver;
import com.amazon.AutomationFramework.Navigation.AccountsAndLists_Navi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Lists_Page {

    public static boolean IsAtCorrect(){
        WebElement CurrentList = Driver.Instance.findElement(By.xpath("//span[@id='profile-list-name']"));
        try {Thread.sleep(1500); } catch (InterruptedException i){System.out.println(i.getMessage());}
        String tempListName = Driver.Instance.findElement(By.xpath("//span[@id='profile-list-name']")).getText();
        return tempListName.equals(CreateAList_Page.getListName());
    }
    public static boolean DoesListExist(String listName){
        AccountsAndLists_Navi.YourLists.Select();
        List<WebElement> ListNames = Driver.Instance.findElements(By.xpath("//div[@id='your-lists-nav']/div[1]/a"));
        for (WebElement w:ListNames) {
            String listNameText= w.findElement(By.tagName("span")).getText();
            if (listName.equals(listNameText)){
                return true;
            }
        }
        return false;
    }
}
