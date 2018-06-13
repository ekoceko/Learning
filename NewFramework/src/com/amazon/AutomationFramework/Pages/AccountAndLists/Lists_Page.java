package com.amazon.AutomationFramework.Pages.AccountAndLists;

import com.amazon.AutomationFramework.Navigation.AccountsAndLists;
import com.amazon.AutomationFramework.Selenium.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Lists_Page {
    private static int lastCount;
    private static int deletedListCount;

    public static int getDeletedListCount() {
        return deletedListCount;
    }

    private static void setDeletedListCount(int deletedListCount) {
        Lists_Page.deletedListCount = deletedListCount;
    }


    public static void GoTo(){
        AccountsAndLists.YourLists.Select();
    }
    public static boolean IsAtCorrect(){
        WebElement CurrentList = Driver.Instance.findElement(By.xpath("//span[@id='profile-list-name']"));
        Driver.Wait(1.5);
        String tempListName = Driver.Instance.findElement(By.xpath("//span[@id='profile-list-name']")).getText();
        return tempListName.equals(CreateAList_Page.getListName());
    }
public static void StoreListCount(){
        lastCount = GetListCount();
}
public static int PreviousListCount(){
        return lastCount;
}
public static int CurrentListCount(){
        return GetListCount();
}
private static int GetListCount(){
        return GetAllLists().size();
}
    private static WebElement FindInListbyListName(String listName){
        String name = null;
        for (WebElement element:GetAllLists()) {
            name = element.getText();
            if (listName.equals(name)){
                return element;
            }
        }
        return null;
    }
    public static boolean DoesListExist(String listName){
        if (FindInListbyListName(listName)!=null){
            return true;
        }
        return false;
    }

    public static void DeleteList(String delListName){
        if (DoesListExist(delListName)==true){
            while(FindInListbyListName(delListName)!=null){
            Deleter(FindInListbyListName(delListName));
            setDeletedListCount(getDeletedListCount()+1);
            }
        }
        else throw new Error("List does not exists");
    }
    private static List<WebElement> GetAllLists(){

        List<WebElement> ListNames;
        Driver.Instance.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        ListNames= Driver.Instance.findElements(By.xpath("//div[@id='your-lists-nav']/nav/ul[1]//span/a/div/div/div[1]/div[1]"));
        //Driver.NoWait(() -> { System.out.println("Do nothing!"); });
        Driver.Instance.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        return ListNames;

    }
    public static void DeleteAllLists(){
        for (WebElement element:GetAllLists()) {
            Deleter(element);
        }

    }
    private static void Deleter(WebElement deleteNow){
        deleteNow.click();
        WebElement tripleDot = Driver.Instance.findElement(By.xpath("//a[@id='overflow-menu-popover-trigger']"));
        Actions actions = new Actions(Driver.Instance);
        actions.moveToElement(tripleDot).perform();
        Driver.Wait(1);
        //tripleDot.click();
        WebElement editYourList = Driver.Instance.findElement(By.xpath("//a[@id='editYourList']"));
        editYourList.click();
        WebElement deleteButton = Driver.Instance.findElement(By.xpath("//button[text() = 'Delete list']"));
        deleteButton.click();
        Driver.Wait(1);
        WebElement confirmButton = Driver.Instance.findElement(By.xpath("//span[@id='list-delete-confirm']//span[@class='a-button-inner']//input[@name='submit.save']"));
        System.out.println("got the element");
        confirmButton.click();
        confirmButton.sendKeys(Keys.ENTER);

        System.out.println("clicked");
        Driver.Wait(2);
    }

}
