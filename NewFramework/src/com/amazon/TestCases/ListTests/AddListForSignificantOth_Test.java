package com.amazon.TestCases.ListTests;

import com.amazon.AutomationFramework.Pages.AccountAndLists.CreateAList_Page;
import com.amazon.AutomationFramework.Pages.AccountAndLists.Lists_Page;
import com.amazon.TestCases.BaseTests.AmazonBase_Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddListForSignificantOth_Test extends AmazonBase_Test {
    @Test
    public void CanAddListForOther(){
        CreateAList_Page.GoTo();
        CreateAList_Page.IsForSomeone().WithNameAndRelationship("Bahar", "Cek", CreateAList_Page.sRelationship.Significant_Other).PrivacyAs(CreateAList_Page.sPrivacy.Private).Create();
        Assert.assertTrue(Lists_Page.IsAtCorrect(),"Lists does not match!");

    }
}