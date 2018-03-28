package eko.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver Instance;

    public static void Initialize(){
        System.setProperty("webdriver.gecko.driver", "D:\\geckodriver\\geckodriver.exe");
        Instance = new FirefoxDriver();
        Instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public static void Close() {
        Instance.close();
    }
}
