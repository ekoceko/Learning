package eko.tests;

import eko.framework.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddListForSignificantOth_Test extends AmazonBase_Test{
    @Test
    public void CanAddWishList(){
        CreateAList.GoTo();
        CreateAList.IsForSomeone().WithNameAndRelationship("Bahar", "Cek", CreateAList.sRelationship.Significant_Other).PrivacyAs(CreateAList.sPrivacy.Private).Create();
        Assert.assertTrue(ListsPage.IsAtCorrect(),"Lists does not match!");

    }
}