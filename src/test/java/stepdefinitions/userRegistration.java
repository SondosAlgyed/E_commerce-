package stepdefinitions;

import Pages.RegisterPage;
import Pages.homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class userRegistration
{
    String FName="dod";
    String LName="Algyed";
    String Email="dod@gmail.com";
    String password="1234567";
    RegisterPage register;
    homePage home;

    @Given("user go to register page")
    public void user_go_to_register_page() throws InterruptedException
    {
        home=new homePage();
        home.userCanGORgiterpage().click();
    }
    @When("user enter valid data")
    public void user_enter_valid_data()
    {
        register=new RegisterPage();
        register.userRegiter(FName,LName,Email,password);
    }

    @And("user click to register")
    public void click_to_register()
    {
        register.Registerbtn().click();
    }

    @Then("user could register Successfully")
    public void user_could_register_successfully()
    {
        Assert.assertTrue(register.confirmRegister().isDisplayed());
    }


}
