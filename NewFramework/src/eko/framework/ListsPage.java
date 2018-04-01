package eko.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListsPage {

    public static boolean IsAtCorrect(){
        WebElement CurrentList = Driver.Instance.findElement(By.xpath("//span[@id='profile-list-name']"));
        try {Thread.sleep(1500); } catch (InterruptedException i){System.out.println(i.getMessage());}
        String tempListName = Driver.Instance.findElement(By.xpath("//span[@id='profile-list-name']")).getText();
        System.out.println("current list is "+tempListName);
        System.out.println("comparing to "+CreateAList.getListName());
        return tempListName.equals(CreateAList.getListName());
    }
    public static boolean DoesListExist(String listName){
        AccountsAndLists_GUI.YourLists.Select();
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
