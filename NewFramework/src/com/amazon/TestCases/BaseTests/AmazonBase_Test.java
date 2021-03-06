package com.amazon.TestCases.BaseTests;

import com.amazon.AutomationFramework.Pages.Base.Login_Page;
import com.amazon.AutomationFramework.Selenium.Driver;
import com.amazon.AutomationFramework.WorkFlows.ListCreator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.LinkedList;
import java.util.List;

public class AmazonBase_Test {
    @BeforeTest
    public void BeforeTest(){
        Driver.Initialize();
        ListCreator.Initialize();
        Login_Page.GoTo();
        Login_Page.LoginAs(Driver.username).WithPassword(Driver.password).Login();

        List<String> asd = new LinkedList<>();
        asd.add("asdf");
        String nsdfsda = asd.get(0);
    }
    @AfterTest
    public void AfterTest(){
        ListCreator.Close();
        Driver.Close();

    }
}
