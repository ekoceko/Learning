package eko.tests;

import eko.framework.Driver;
import eko.framework.LoginPage;
import eko.framework.MainPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AmazonBase_Test {
    @BeforeTest
    public void BeforeTest(){
        Driver.Initialize();
        LoginPage.GoTo();
        LoginPage.LoginAs(Driver.username).WithPassword(Driver.password).Login();

    }
    @AfterTest
    public void AfterTest(){
        Driver.Close();
    }
}
