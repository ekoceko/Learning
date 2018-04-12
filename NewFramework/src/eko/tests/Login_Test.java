package eko.tests;

import eko.framework.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Test extends AmazonBase_Test{

    @Test
    public void LoginToAmazon(){
        Assert.assertTrue(MainPage.IsAt(),"Failed to login!");

    }
}