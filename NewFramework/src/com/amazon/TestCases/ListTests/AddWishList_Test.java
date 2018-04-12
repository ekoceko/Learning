package com.amazon.TestCases.ListTests;

import com.amazon.AutomationFramework.Pages.AccountAndLists.CreateAList_Page;
import com.amazon.AutomationFramework.Pages.AccountAndLists.CreateAList_Page.sPrivacy;
import com.amazon.AutomationFramework.Pages.AccountAndLists.Lists_Page;
import com.amazon.TestCases.BaseTests.AmazonBase_Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddWishList_Test extends AmazonBase_Test {

    @Test
    public void CanAddWishList(){
        CreateAList_Page.GoTo();
        CreateAList_Page.IsForYou().AWishList().WithName("Whish List X").PrivacyAs(sPrivacy.Public).Create();
        Assert.assertTrue(Lists_Page.IsAtCorrect(),"Lists does not match!");
    }
}