package com.amazon.AutomationFramework.Navigation;

import com.amazon.AutomationFramework.Selenium.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class AccountsAndLists {
    static final String menuName = "accountList";

    public static class CreateAList {
        public static void Select() {
            TopMenuSelector_Navi.HoverOnMenu(menuName);
            TopMenuSelector_Navi.SuperSelect("Create a List");
            //If existing lists count is smaller than 3
            try {
                if (Driver.Instance.findElement(By.xpath("//a[@id='createList-announce']")).isDisplayed()) {
                    Driver.Instance.findElement(By.xpath("//a[@id='createList-announce']")).click();
                }
            } catch (NoSuchElementException ne) {
                ne.getMessage();
            }
        }
    }

    public static class YourLists {
        public static void Select() {
            TopMenuSelector_Navi.HoverOnMenu(menuName);
            TopMenuSelector_Navi.SuperSelect("Your Lists");
        }
    }
}
