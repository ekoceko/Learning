package com.amazon.AutomationFramework.Pages.AccountAndLists;

import com.amazon.AutomationFramework.Navigation.AccountsAndLists;
import com.amazon.AutomationFramework.Selenium.Driver;
import com.amazon.AutomationFramework.WorkFlows.ListCreator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Lists_Page {
    private static int lastCount;
    private static int deletedListCount;

    public static boolean IsAt() {
        WebElement yourListTitle =null;
        try{yourListTitle = Driver.Instance.findElement(By.xpath("//div[@role='heading']"));}
        catch (NoSuchElementException e){
            System.out.println("not at the page, need to redirect...");
        }
        if(yourListTitle!=null && yourListTitle.getText().equals("Your Lists")){
            return true;
        }
        else {
            return false;
        }
    }


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
        //WebElement CurrentList = Driver.Instance.findElement(By.xpath("//span[@id='profile-list-name']"));
        Driver.Wait(1.5);
        String tempListName = Driver.Instance.findElement(By.xpath("//span[@id='profile-list-name']")).getText();
        return tempListName.equals(ListCreator.getTestListName());
    }
public static void StoreListCount(){
        if(!IsAt()){
            System.out.println("need to go to Lists page");
            GoTo();
        }
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
    public static WebElement FindInListbyListName(String listName){
        String name;
        for (WebElement element:GetAllLists()) {
            name = element.getText();
            System.out.println(" "+ listName +" equals "+ name );

            if (listName.equals(name)){
                System.out.println("Found match "+ listName +" equals "+ name );
                return element;
            }
        }
        System.out.println("returning null");
        return null;
    }
    public static boolean DoesListExist(String listName){
        if (FindInListbyListName(listName)!=null){
            System.out.println("List Exists");
            return true;
        }
        System.out.println("List does not exist");
        return false;
    }

    public static void DeleteList(String delListName){
        if (DoesListExist(delListName)==true){
            while(FindInListbyListName(delListName)!=null){
            Deleter(FindInListbyListName(delListName));
            setDeletedListCount(getDeletedListCount()+1);
            }
        }
        else {
            System.out.println("List does not exist +++ "+delListName );
            throw new Error(delListName+" does not exist");
        }
    }
    private static List<WebElement> GetAllLists(){
        List<WebElement> ListNames;
        ListNames= Driver.Instance.findElements(By.xpath("//div[@id='your-lists-nav']/nav/ul[1]//span/a/div/div/div[1]/div[1]"));
        return ListNames;

    }
    public static void DeleteAllLists(){
        for (WebElement element:GetAllLists()) {
            Deleter(element);
        }

    }
    public static void ManageList(WebElement modifyList){
        modifyList.click();
        WebElement tripleDot = Driver.Instance.findElement(By.xpath("//a[@id='overflow-menu-popover-trigger']"));
        Actions actions = new Actions(Driver.Instance);
        actions.moveToElement(tripleDot).perform();
        Driver.Wait(1);
        //tripleDot.click();
        WebElement editYourList = Driver.Instance.findElement(By.xpath("//a[@id='editYourList']"));
        editYourList.click();
    }
    private static void Deleter(WebElement deleteNow){
        ManageList(deleteNow);

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
