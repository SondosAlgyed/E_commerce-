package stepdefinitions;

import Pages.LoginPage;
import Pages.homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class userLogin {

    String Email="dod@gmail.com";
    String password="1234567";
    LoginPage login;
    homePage home;
    @Given("user go to login page")
    public void user_go_to_login_page()
    {
        home=new homePage();
        home.usergotologinpage().click();
    }
    @When("user enter valid email and password")
    public void user_enter_valid_email_and_password()
    {
        login=new LoginPage();
        login.userlogin(Email,password);
    }
    @Then("user could log in Successfully and go to home page")
    public void user_could_log_in_successfully_and_go_to_home_page()
    {
        Assert.assertEquals("https://demo.nopcommerce.com/",Hooks.driver.getCurrentUrl());
    }
}
