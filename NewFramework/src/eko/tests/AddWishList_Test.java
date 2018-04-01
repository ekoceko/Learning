package eko.tests;

import eko.framework.CreateAList.sPrivacy;
import eko.framework.*;
import eko.framework.ListsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddWishList_Test extends AmazonBase_Test {

    @Test
    public void CanAddWishList(){
        CreateAList.GoTo();
        CreateAList.IsForYou().AWishList().WithName("Whish List X").PrivacyAs(sPrivacy.Public).Create();
        Assert.assertTrue(ListsPage.IsAtCorrect(),"Lists does not match!");
    }
}