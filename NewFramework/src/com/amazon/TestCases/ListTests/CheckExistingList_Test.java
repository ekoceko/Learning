package com.amazon.TestCases.ListTests;

import com.amazon.AutomationFramework.Pages.Lists_Page;
import com.amazon.TestCases.BaseTests.AmazonBase_Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckExistingList_Test extends AmazonBase_Test {

    @Test
    public void CheckExistingList(){
       Assert.assertTrue(
               Lists_Page.DoesListExist("ShoppingListX3"
               ),"List does not exist!");
    }
}