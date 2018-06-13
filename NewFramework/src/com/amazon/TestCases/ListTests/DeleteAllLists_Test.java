package com.amazon.TestCases.ListTests;

import com.amazon.AutomationFramework.Pages.AccountAndLists.Lists_Page;
import com.amazon.TestCases.BaseTests.AmazonBase_Test;
import org.testng.annotations.Test;

public class DeleteAllLists_Test extends AmazonBase_Test {

    @Test
    public void DeleteList(){
        Lists_Page.GoTo();
        Lists_Page.DeleteAllLists();
    }
}