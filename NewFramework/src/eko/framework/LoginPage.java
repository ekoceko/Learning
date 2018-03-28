package eko.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
    public static void GoTo() {
        Driver.Instance.get("https://www.amazon.com/gp/sign-in.html");
    }

    public static LoginCommand LoginAs(String userName) {

        return new LoginCommand(userName);
    }

    public static class LoginCommand {

        private String userName;
        private String password;

        public LoginCommand(String userName) {
            this.userName = userName;
        }

        public LoginCommand WithPassword(String password) {
            this.password = password;

        return this;
        }

        public void Login() {
            Driver.Instance.findElement(By.id("ap_email")).sendKeys(this.userName);
            Driver.Instance.findElement(By.id("continue")).click();
            Driver.Instance.findElement(By.id("ap_password")).sendKeys(this.password);
            Driver.Instance.findElement(By.id("signInSubmit")).click();
        }
    }
}

