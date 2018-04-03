package com.amazon.AutomationFramework.Pages;

import com.amazon.AutomationFramework.Navigation.TopMenuSelector_Navi;
import com.amazon.AutomationFramework.Selenium.Driver;
import com.amazon.AutomationFramework.Navigation.AccountsAndLists_Navi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class CreateAList_Page {
    public  enum sPrivacy {Private, Public};
    public  enum sRelationship {Friend, Mom, Dad, Child, Sibling, Relative, Significant_Other, Other};
    public static String ListName;
    private static By  CreateListBy = By.xpath("//span[@class='a-declarative']//span[@class='a-button a-button-primary']//span[@class='a-button-inner']//input[@class='a-button-input a-declarative']");

    public static void GoTo() {
        TopMenuSelector_Navi.AccountsAndLists.CreateAList();
    }


    public static ForYouDetails IsForYou() {
        Driver.Wait(0.5);

        Driver.Instance.findElement(By.xpath("//span[@id='WLNEW_list_for']//span[@class='a-button-inner']//span[@class='a-button-text a-declarative']")).click();
        Driver.Wait(0.5);

        Driver.Instance.findElement(By.xpath("//a[@id='create_for_0']")).click();
        return new ForYouDetails();
    }
    public static String getListName() {
        return CreateAList_Page.ListName;
    }

    public static void setListName(String listName) {
        CreateAList_Page.ListName = listName;
    }
    public static class ForYouDetails {

        private WebElement Listtype;
        private WebElement ListNameField;
        private WebElement ListDescField;
        private static WebElement PrivacyButton;
        private String listDescriptionValue;


        public ForYouDetails() {

        }

        public ShoppingForYou AShoppingList(){
            this.Listtype = Driver.Instance.findElement(By.xpath("//label[@for='WLNEW_list_type_SL']//i[@class='a-icon a-icon-radio']"));
            return new ShoppingForYou();
        }
        public WishForYou AWishList(){
            this.Listtype = Driver.Instance.findElement(By.xpath("//label[@for='WLNEW_list_type_WL']//i[@class='a-icon a-icon-radio']"));
            return new WishForYou();
        }
        public IdeaForYou AnIdeaList(){
            this.Listtype = Driver.Instance.findElement(By.xpath("//label[@for='WLNEW_list_type_IL']//i[@class='a-icon a-icon-radio']"));
            return new IdeaForYou();
        }


        public class ShoppingForYou extends ForYouDetails {
            public ShoppingForYou WithName(String listName) {
                setListName(listName);
                ListNameField = Driver.Instance.findElement(By.xpath("//input[@id='WLNEW_list_name']"));
                return this;
            }
            public ShoppingForYou PrivacyAs(sPrivacy sprivacy) {
                String privacyButton;
                if (sprivacy == sPrivacy.Private){
                    privacyButton = "//span[@id='WLNEW_privacy_private']";
                } else if (sprivacy==sPrivacy.Public){
                    privacyButton = "//span[@id='WLNEW_privacy_public']";
                }
                 else throw new Error("Wrong Privacy Type");
                PrivacyButton = Driver.Instance.findElement(By.xpath(privacyButton));
                return this;
            }
            public void Create(){
                Listtype.click();
                ListNameField.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),Keys.DELETE);
                ListNameField.clear();
                ListNameField.sendKeys(getListName());
                PrivacyButton.click();
                Driver.Instance.findElement(CreateListBy).click();
            }
        }
        public class WishForYou extends ForYouDetails {
            public WishForYou WithName(String listName) {
                this.AShoppingList().WithName(listName);
                return this;
            }
            public WishForYou PrivacyAs(sPrivacy sprivacy) {
                this.AShoppingList().PrivacyAs(sprivacy);
                return this;
            }
            public void Create(){
                this.AShoppingList().Create();
            }
        }
        public class IdeaForYou extends ForYouDetails {
            public IdeaForYou WithName(String listName) {
                setListName(listName);
                ListNameField = Driver.Instance.findElement(By.xpath("//textarea[@id='create-name-il']"));
                return this;
            }
            public IdeaForYou WithNameAndDesc(String listName, String description) {
                WithName(listName);
                listDescriptionValue = description;
                ListDescField = Driver.Instance.findElement(By.xpath("//textarea[@id='create-description-il']"));
                return this;
            }
            public void Create(){
                Listtype.click();
                ListNameField.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),Keys.DELETE);
                ListNameField.clear();
                System.out.println("writing list name");
                ListNameField.sendKeys(getListName());
                ListDescField.sendKeys(listDescriptionValue);
                Driver.Instance.findElement(CreateListBy).click();
            }
        }

    }
    public static ForSomeoneDetails IsForSomeone() {
        return new ForSomeoneDetails();
    }

    public static class ForSomeoneDetails {
        public ForSomeoneDetails WithNameAndRelationship(String firstName, String lastName, sRelationship relationship){
            Driver.Instance.findElement(By.xpath("//input[@id='WLNEW_recipient_first_name']")).sendKeys(firstName);
            Driver.Instance.findElement(By.xpath("//input[@id='WLNEW_recipient_last_name']")).sendKeys(lastName);
            Driver.Instance.findElement(By.xpath("//span[@id='WLNEW_relationship']//span[@class='a-button-inner']//span[@class='a-button-text a-declarative']"));
            Select Relationship = new Select(Driver.Instance.findElement(By.id("choose-relationship")));
            String relstring;
            if (relationship==sRelationship.Significant_Other){
                relstring = "Significant Other";
            }
            else {
                relstring = relationship.toString();
            }
            Relationship.selectByVisibleText(relstring);


        return this;
        }
        public ForSomeoneDetails PrivacyAs(sPrivacy sprivacy) {
            String privacyButton;
            if (sprivacy == sPrivacy.Private){
                privacyButton = "//span[@id='WLNEW_privacy_private']";
            } else if (sprivacy==sPrivacy.Public){
                privacyButton = "//span[@id='WLNEW_privacy_public']";
            }
            else throw new Error("Wrong Privacy Type");
            Driver.Instance.findElement(By.xpath(privacyButton)).click();
            return this;
        }
        public void Create(){
              Driver.Instance.findElement(CreateListBy).click();
        }
    }
}
