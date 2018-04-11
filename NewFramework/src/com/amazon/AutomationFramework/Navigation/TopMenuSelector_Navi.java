package com.amazon.AutomationFramework.Navigation;

import com.amazon.AutomationFramework.Selenium.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TopMenuSelector_Navi {
    static String menuName;
    static String SubLinkTitle;
    private static void SuperSelect(String SubLinkTitle){
        Driver.Instance.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'"+SubLinkTitle+"')]")).click();
        Driver.Wait(1);
    }
    private static void HoverOnMenu(){
        WebElement hoverOnElement =  Driver.Instance.findElement(By.xpath("//a[@id='nav-link-"+menuName+"']"));
        Actions actions = new Actions(Driver.Instance);
        actions.moveToElement(hoverOnElement).perform();
        Driver.Wait(1);
    }
    private static void HoverOnMenu(String SubMenuName){
        WebElement hoverOnElement =  Driver.Instance.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'"+SubMenuName+"')]"));
        Actions actions = new Actions(Driver.Instance);
        actions.moveToElement(hoverOnElement).perform();
        Driver.Wait(1);
    }
    public static class AccountsAndLists{
        public AccountsAndLists(){ menuName="accountList"; }
        public static void CreateAList() {
            SubLinkTitle="Create a List";
            HoverOnMenu();
            SuperSelect(SubLinkTitle);
            //If existing lists count is smaller than 3
            try { if (Driver.Instance.findElement(By.xpath("//a[@id='createList-announce']")).isDisplayed()){
            Driver.Instance.findElement(By.xpath("//a[@id='createList-announce']")).click(); } }
            catch (NoSuchElementException ne){
                ne.getMessage(); }
        }
        public static void YourLists() {
            SubLinkTitle="Your Lists";
            HoverOnMenu();
            SuperSelect(SubLinkTitle);
        }
    }

    public static class Departments{
        public Departments(){menuName="shopall";}

        public static class MoviesMusicAndGames{
            public MoviesMusicAndGames(){
            SubLinkTitle = "Movies, Music & Games"; }
            public static void Select() {
                HoverOnMenu();
                SuperSelect(SubLinkTitle);
            }
            public static void MusicalInsttruments(){
                HoverOnMenu(SubLinkTitle);
                SubLinkTitle = "Musical Instruments";
                SuperSelect(SubLinkTitle);
            }

            public static void Headphones(){
                HoverOnMenu(SubLinkTitle);
                SubLinkTitle = "Headphones";
                SuperSelect(SubLinkTitle);
            }


        }
    }
    //Other Main Page Elements
}

