package com.amazon.TestCases.ListTests;

import com.amazon.AutomationFramework.Pages.AccountAndLists.Lists_Page;
import com.amazon.TestCases.BaseTests.AmazonBase_Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteList_Test extends AmazonBase_Test {

    @Test
    public void DeleteList(){
        Lists_Page.GoTo();
        Lists_Page.StoreListCount();
        String listToDelete = "Shopping List";
        Lists_Page.DeleteList(listToDelete);
        Assert.assertEquals(Lists_Page.PreviousListCount()-Lists_Page.getDeletedListCount(),Lists_Page.CurrentListCount());
        Assert.assertTrue(!Lists_Page.DoesListExist(listToDelete));
    }
}