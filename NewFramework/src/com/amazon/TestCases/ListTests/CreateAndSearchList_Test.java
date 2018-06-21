package com.amazon.TestCases.ListTests;

import com.amazon.AutomationFramework.Pages.AccountAndLists.Lists_Page;
import com.amazon.AutomationFramework.WorkFlows.ListCreator;
import com.amazon.TestCases.BaseTests.AmazonBase_Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAndSearchList_Test extends AmazonBase_Test {

    @Test
    public void CreateAndSearchList(){

        //Get List Count
        Lists_Page.StoreListCount();

        //Create a list
        ListCreator.CreateAShoppingList();

        //Confirm list is added and exists
        Assert.assertTrue(Lists_Page.DoesListExist(ListCreator.testListName));
        Assert.assertEquals(Lists_Page.PreviousListCount()+1,Lists_Page.CurrentListCount());

        //List will be deleted after execution
    }
}