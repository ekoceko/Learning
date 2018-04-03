package eko.tests;

import eko.framework.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Login_Test extends AmazonBase_Test{

    @Test
    public void LoginToAmazon(){
        Assert.assertTrue(MainPage.IsAt(),"Failed to login!");

    }
}