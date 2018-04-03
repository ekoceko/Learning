package com.amazon.AutomationFramework.Navigation;

import com.amazon.AutomationFramework.Selenium.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class AccountsAndLists_Navi {

    public static class CreateAList{
         public static void Select(){
             TopMenuSelector_Navi.AccountsAndLists.CreateAList();
             try { if (Driver.Instance.findElement(By.xpath("//a[@id='createList-announce']")).isDisplayed()){
                 Driver.Instance.findElement(By.xpath("//a[@id='createList-announce']")).click(); }
             }
             catch (NoSuchElementException ne){
                 ne.getMessage();
             }
         }
    }
    public static class YourLists{
        public static void Select() {
            TopMenuSelector_Navi.AccountsAndLists.Select("Your Lists");
        }
    }


}
