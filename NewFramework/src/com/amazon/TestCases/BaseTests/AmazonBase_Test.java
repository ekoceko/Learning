package com.amazon.TestCases.BaseTests;

import com.amazon.AutomationFramework.Selenium.Driver;
import com.amazon.AutomationFramework.Pages.Login_Page;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AmazonBase_Test {
    @BeforeTest
    public void BeforeTest(){
        Driver.Initialize();
        Login_Page.GoTo();
        Login_Page.LoginAs(Driver.username).WithPassword(Driver.password).Login();

    }
    @AfterTest
    public void AfterTest(){
        Driver.Close();
    }
}
