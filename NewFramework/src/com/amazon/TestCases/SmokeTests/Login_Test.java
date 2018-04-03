package com.amazon.TestCases.SmokeTests;

import com.amazon.AutomationFramework.Pages.Main_Page;
import com.amazon.TestCases.BaseTests.AmazonBase_Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Test extends AmazonBase_Test {

    @Test
    public void LoginToAmazon(){
        Assert.assertTrue(Main_Page.IsAt(),"Failed to login!");

    }
}