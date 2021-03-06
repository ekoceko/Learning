package com.amazon.AutomationFramework.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver Instance;
    public static String BaseAddress = "https://www.amazon.com";
    public static String username = "ekrem.test@hotmail.com";
    public static String password = "!Ekrem1905";

    public static void Initialize(){
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        if (null == Instance) {
            Instance = new FirefoxDriver();
        }

        Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    public static void Close() {
        //Instance.close();
    }
    public static void Wait(double seconds) {
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
/*
    public static void NoWait(Action action){
        TurnOffWait();
        action.perform();
        TurnOnWait();
    }

    private static void TurnOffWait() {
        Instance.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }
    private static void TurnOnWait() {
        Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    */
}
