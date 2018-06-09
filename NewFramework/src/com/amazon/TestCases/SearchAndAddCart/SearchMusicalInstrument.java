package com.amazon.TestCases.SearchAndAddCart;

import com.amazon.AutomationFramework.Pages.Base.Main_Page;
import com.amazon.AutomationFramework.Pages.Base.Product_Page;
import com.amazon.AutomationFramework.Pages.Base.Results_Page;
import com.amazon.TestCases.BaseTests.AmazonBase_Test;
import org.testng.annotations.Test;

public class SearchMusicalInstrument extends AmazonBase_Test {

    @Test
    public void SearchAndAddCart(){
        Main_Page.SearchMusicalInstrument("DiMarzio  x2n");
        Results_Page.SelectFirstResult();
        Product_Page.AddCart();

    }
}