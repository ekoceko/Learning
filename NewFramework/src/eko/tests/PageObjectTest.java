package eko.tests;

import eko.framework.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PageObjectTest {
    @BeforeTest
    public void init(){
        Driver.Initialize();
    }
    @Test
    public void LoginToAmazon(){

        LoginPage.GoTo();
        LoginPage.LoginAs("ekremcek19@hotmail.com").WithPassword("!Deaden77").Login();
        Assert.assertTrue(MainPage.IsAt(),"Failed to login!");

    }
    @AfterTest
    public void AfterTest(){
        Driver.Close();
    }
}