package eko.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

class AccountsAndLists_GUI {
    private static void HoverOnMenu(){
        WebElement hoverOnElement =  Driver.Instance.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        Actions actions = new Actions(Driver.Instance);
        actions.moveToElement(hoverOnElement).perform();
        Driver.Wait(1);
            }
    public static class CreateAList{
         static void Select(){
            HoverOnMenu();
            Driver.Instance.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'Create a List')]")).click();
            Driver.Wait(1);
            //If existing lists are smaller than 3
            try { if (Driver.Instance.findElement(By.xpath("//a[@id='createList-announce']")).isDisplayed()){
                    Driver.Instance.findElement(By.xpath("//a[@id='createList-announce']")).click(); }
            }catch (NoSuchElementException ne){
                ne.getMessage(); }
            String CreateListTitle = Driver.Instance.findElement(By.xpath("//div[@class='a-popover-header']/h4")).getText();
            Assert.assertEquals(CreateListTitle, "Create a List", "Create A List page is not opened");
        }
    }
    public static class YourLists{
        static void Select() {
            HoverOnMenu();
            Driver.Instance.findElement(By.xpath("//span[@class='nav-text'][contains(text(),'Your Lists')]")).click();
            Driver.Wait(1);

        }
    }

}
