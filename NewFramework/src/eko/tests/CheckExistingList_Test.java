package eko.tests;

import eko.framework.ListsPage;
import eko.framework.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckExistingList_Test extends AmazonBase_Test{

    @Test
    public void CheckExistingList(){
       Assert.assertTrue(
               ListsPage.DoesListExist("ShoppingListX"
               ),"List does not exist!");
    }
}