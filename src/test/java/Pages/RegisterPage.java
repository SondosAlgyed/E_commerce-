package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinitions.Hooks;

public class RegisterPage {


    WebElement genderBtn=Hooks.driver.findElement(By.id("gender-female"));
    WebElement firstNameTxt=Hooks.driver.findElement(By.id("FirstName"));
    WebElement LastNameTxt=Hooks.driver.findElement(By.id("LastName"));
    WebElement EmailTxt=Hooks.driver.findElement(By.id("Email"));
    WebElement PasswordTxt=Hooks.driver.findElement(By.id("Password"));
    WebElement ConfirmPasswordTxt=Hooks.driver.findElement(By.id("ConfirmPassword"));

    public void  userRegiter(String firstName,String lastname,String Email,String password)
    {
        genderBtn.click();
        firstNameTxt.sendKeys(firstName);
        LastNameTxt.sendKeys(lastname);
        EmailTxt.sendKeys(Email);
        PasswordTxt.sendKeys(password);
        ConfirmPasswordTxt.sendKeys(password);

    }
    public WebElement Registerbtn()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement confirmRegister()
    {
        return Hooks.driver.findElement(By.cssSelector("div.result"));
    }
}
