package com.amazon.TestCases.ListTests;

import com.amazon.AutomationFramework.Pages.AccountAndLists.CreateAList_Page;
import com.amazon.AutomationFramework.Pages.AccountAndLists.Lists_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddIdeaList_Test {

    @Test
    public void CanAddWishList(){
        CreateAList_Page.GoTo();
        CreateAList_Page.IsForYou().AnIdeaList().WithNameAndDesc("MyIdea", "Excellent Ideas").Create();
        Assert.assertTrue(Lists_Page.IsAtCorrect(),"Lists does not match!");

    }

}