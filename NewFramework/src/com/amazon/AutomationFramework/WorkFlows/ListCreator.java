package com.amazon.AutomationFramework.WorkFlows;

import com.amazon.AutomationFramework.Pages.AccountAndLists.CreateAList_Page;
import com.amazon.AutomationFramework.Pages.AccountAndLists.Lists_Page;
import com.amazon.AutomationFramework.Selenium.Generator;


public class ListCreator {
    public static boolean isCreatedAList() {
        if (getTestListName()==null){
            return false;}
        else{
            return true;
        }
    }

    public static String getTestListName() {
        return ListCreator.testListName;
    }

    public static void setTestListName(String testListName) {
        ListCreator.testListName = testListName;
    }

    public static String testListName = "MyDefaultList";
    public static String amazonDefaultListName = "Shopping List";


    public static void CreateAShoppingList() {
        CreateAList_Page.GoTo();
        setTestListName(Generator.GenerateListName());
        CreateAList_Page.IsForYou().AShoppingList().WithName(getTestListName()).PrivacyAs(CreateAList_Page.sPrivacy.Private).Create();
    }


    public static void Initialize() {
        setTestListName(null);
    }

    public static void Close() {
        if (isCreatedAList()){
            DeleteList();
        }
    }

    private static void DeleteList() {
        Lists_Page.DeleteList(getTestListName());
        Initialize();
    }
}
