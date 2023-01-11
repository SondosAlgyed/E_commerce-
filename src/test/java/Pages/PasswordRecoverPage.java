package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinitions.Hooks;

public class PasswordRecoverPage {


    public WebElement recoverPassword()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    WebElement RecoverBtn= Hooks.driver.findElement(By.name("send-email"));
    public void recoverbttn()
    {
        RecoverBtn.click();
    }

    public WebElement Result() {
        return Hooks.driver.findElement(By.cssSelector("div.bar-notification.success"));
    }
}
