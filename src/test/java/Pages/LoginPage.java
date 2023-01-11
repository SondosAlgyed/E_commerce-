package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinitions.Hooks;

public class LoginPage {

     WebElement EmailTxt=Hooks.driver.findElement(By.id("Email"));
    WebElement PasswordTxt=Hooks.driver.findElement(By.id("Password"));
    WebElement loginBtn=Hooks.driver.findElement(By.cssSelector("button.button-1.login-button"));

    public void userlogin(String Email,String Password)
    {
        EmailTxt.sendKeys(Email);
        PasswordTxt.sendKeys(Password);
        loginBtn.click();
    }
    public WebElement ForgotpasswordBtn()
    {
        return Hooks.driver.findElement(By.linkText("Forgot password?"));
    }
}
