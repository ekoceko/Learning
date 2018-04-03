package com.amazon.AutomationFramework.Pages;

import com.amazon.AutomationFramework.Selenium.Driver;

public class Main_Page {
    private static String title = "Your Account";
    public static boolean IsAt() {

        return Driver.Instance.getTitle().equals(title);
    }
}
