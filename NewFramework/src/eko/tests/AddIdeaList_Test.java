package eko.tests;

import eko.framework.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddIdeaList_Test {

    @Test
    public void CanAddWishList(){
        CreateAList.GoTo();
        CreateAList.IsForYou().AnIdeaList().WithNameAndDesc("MyIdea", "Excellent Ideas").Create();
        //CreateAList.IsForYou().AnIdeaList().WithName("MyIdea2").Create();
        Assert.assertTrue(ListsPage.IsAtCorrect(),"Lists does not match!");

    }

}