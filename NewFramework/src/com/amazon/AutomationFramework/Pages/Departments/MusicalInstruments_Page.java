package com.amazon.AutomationFramework.Pages.Departments;


import com.amazon.AutomationFramework.Navigation.Departments;
import com.amazon.AutomationFramework.Selenium.Driver;
import org.openqa.selenium.By;

import com.amazon.AutomationFramework.Navigation.TopMenuSelector_Navi;
import com.amazon.AutomationFramework.Pages.AccountAndLists.CreateAList_Page;
import com.amazon.AutomationFramework.Selenium.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class MusicalInstruments_Page {
    //span[@class='nav-a-content'][contains(text(),'Musical Instruments')]
    public static void GoTo() {

        Departments.MoviesMusicAndGames().MusicalInsttruments();
        //TopMenuSelector_Navi.Departments.MoviesMusicAndGames.MusicalInsttruments();
    }

    public static boolean IsAtCorrect(){
       Driver.Wait(1);

        String tempListName = Driver.Instance.findElement(By.xpath("//span[@class='nav-a-content'][contains(text(),'Musical Instruments')]")).getText();
        return tempListName.equals("Musical Instruments");
    }
}
