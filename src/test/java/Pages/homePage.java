package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepdefinitions.Hooks;

public class homePage {

    Select select;
    public WebElement usergotologinpage()
    {
        return Hooks.driver.findElement(By.linkText("Log in"));
    }

    public WebElement userCanGORgiterpage()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public void userCanChangeCurrency()
    {
        WebElement CurrencyList=Hooks.driver.findElement(By.id("customerCurrency"));
        select=new Select(CurrencyList);
        select.selectByIndex(1);
    }
    public void ScroLLBottom()
    {
        JavascriptExecutor j = (JavascriptExecutor)Hooks.driver;
        j.executeScript("scrollBy(0,1500)");
    }
    public WebElement price=Hooks.driver.findElement(By.cssSelector("span.price.actual-price"));



}
