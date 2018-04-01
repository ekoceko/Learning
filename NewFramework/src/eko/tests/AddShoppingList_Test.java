package eko.tests;

import eko.framework.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddShoppingList_Test extends AmazonBase_Test{

    @Test
    public void CanAddWishList(){
        CreateAList.GoTo();
        CreateAList.IsForYou().AShoppingList().WithName("ShoppingListX3").PrivacyAs(CreateAList.sPrivacy.Private).Create();
        Assert.assertTrue(ListsPage.IsAtCorrect(),"Lists does not match!");

    }

}