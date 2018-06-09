package com.amazon.AutomationFramework.Pages.Base;

import com.amazon.AutomationFramework.Selenium.Driver;
import javafx.concurrent.Worker;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.List;

public class Main_Page {
    private static String title = "Your Account";

    public static boolean IsAt() {
        return Driver.Instance.getTitle().equals(title);
    }

    private static void categorySelector(String categoryName, String searchString){
        Driver.Wait(3);
        WebElement CategorySelectDDB = Driver.Instance.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"));
        CategorySelectDDB.click();
        List<WebElement> optionList = Driver.Instance.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));

        int optionIndex=0;
        for( int i = 0 ; i < optionList.size(); i++){

            String CurrentText = optionList.get(i).getText();
            if (CurrentText.equals(categoryName)){
                optionIndex = i;
                break;
            }
            if (i == optionList.size()-1){
                throw new Error("Option cannot be found");
            }
        }
        WebElement dropDownBox = Driver.Instance.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        dropDownBox.sendKeys(Keys.ENTER);

        while(optionIndex > 0){
            dropDownBox.sendKeys(Keys.DOWN);
            optionIndex--;
        }
        searcher(searchString);
    }
    private static void searcher(String searchSt){
        WebElement searchTextBox = Driver.Instance.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchTextBox.sendKeys(searchSt);
        WebElement searchButton = Driver.Instance.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@type='submit']"));
        searchButton.click();

    }
    public static void SearchMusicalInstrument(String searchString){
        categorySelector("Musical Instruments", searchString);
    }
}
