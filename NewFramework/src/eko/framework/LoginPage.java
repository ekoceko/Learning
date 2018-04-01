package eko.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class LoginPage {
    public static void GoTo() {
        Driver.Instance.navigate().to(Driver.BaseAddress+"/gp/sign-in.html"); //https://www.amazon.com/
        WebDriverWait wait = new WebDriverWait(Driver.Instance, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ap_email")));
    }

    public static LoginCommand LoginAs(String userName) {

        return new LoginCommand(userName);
    }

    public static class LoginCommand {

        private String userName;
        private String password;

        LoginCommand(String userName) {
            this.userName = userName;
        }

        public LoginCommand WithPassword(String password) {
            this.password = password;

        return this;
        }

        public void Login() {
            try {
                if (Driver.Instance.findElement(By.id("ap_password")).isDisplayed()){
                    RecurringLogin();
                }
            }catch (NoSuchElementException ne){
                ne.getMessage();
            }
            FirstLogin();
        }
        private void  FirstLogin(){
            Driver.Instance.findElement(By.id("ap_email")).sendKeys(this.userName);
            Driver.Instance.findElement(By.id("continue")).click();
            RecurringLogin();
        }
        private void RecurringLogin(){
            Driver.Instance.findElement(By.id("ap_password")).sendKeys(this.password);
            Driver.Instance.findElement(By.id("signInSubmit")).click();
        }
    }
}

