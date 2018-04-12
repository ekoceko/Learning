package com.amazon.AutomationFramework.Navigation;

import com.amazon.AutomationFramework.Selenium.Driver;
import org.openqa.selenium.By;
<<<<<<< HEAD
=======
import org.openqa.selenium.NoSuchElementException;
>>>>>>> 8c95de263ead0721f9c091b417aaa952684241b6
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TopMenuSelector_Navi {
    static String menuName;
    static String SubLinkTitle;
<<<<<<< HEAD

    static void SuperSelect(String SubLinkTitle){
        Driver.Instance.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'"+SubLinkTitle+"')]")).click();
        Driver.Wait(1);
    }
    static void HoverOnMenu(String menuname){
        System.out.println("current menu name isx: "+ menuname);
        WebElement hoverOnElement =  Driver.Instance.findElement(By.xpath("//a[@id='nav-link-"+ menuname +"']"));
=======
    private static void SuperSelect(String SubLinkTitle){
        Driver.Instance.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'"+SubLinkTitle+"')]")).click();
        Driver.Wait(1);
    }
    private static void HoverOnMenu(){
        WebElement hoverOnElement =  Driver.Instance.findElement(By.xpath("//a[@id='nav-link-"+menuName+"']"));
>>>>>>> 8c95de263ead0721f9c091b417aaa952684241b6
        Actions actions = new Actions(Driver.Instance);
        actions.moveToElement(hoverOnElement).perform();
        Driver.Wait(1);
    }
<<<<<<< HEAD
    static void HoverOnSubMenu(String SubMenuName){
=======
    private static void HoverOnMenu(String SubMenuName){
>>>>>>> 8c95de263ead0721f9c091b417aaa952684241b6
        WebElement hoverOnElement =  Driver.Instance.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'"+SubMenuName+"')]"));
        Actions actions = new Actions(Driver.Instance);
        actions.moveToElement(hoverOnElement).perform();
        Driver.Wait(1);
    }
<<<<<<< HEAD
}


=======
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
>>>>>>> 8c95de263ead0721f9c091b417aaa952684241b6

