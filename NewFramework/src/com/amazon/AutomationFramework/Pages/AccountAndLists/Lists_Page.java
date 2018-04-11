package com.amazon.AutomationFramework.Pages.AccountAndLists;

import com.amazon.AutomationFramework.Navigation.TopMenuSelector_Navi;
import com.amazon.AutomationFramework.Selenium.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Lists_Page {

    public static boolean IsAtCorrect(){
        WebElement CurrentList = Driver.Instance.findElement(By.xpath("//span[@id='profile-list-name']"));
       Driver.Wait(1.5);
        String tempListName = Driver.Instance.findElement(By.xpath("//span[@id='profile-list-name']")).getText();
        return tempListName.equals(CreateAList_Page.getListName());
    }
    public static boolean DoesListExist(String listName){
        TopMenuSelector_Navi.AccountsAndLists.YourLists();

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
