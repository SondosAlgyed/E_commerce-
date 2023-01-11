package stepdefinitions;

import Pages.LoginPage;
import Pages.PasswordRecoverPage;
import Pages.homePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ResetPassword
{
    homePage home;
    LoginPage login;
    PasswordRecoverPage pass;
    String Email="sondos@gmail.com";
    @Given("user go to login page and go to password recovery page")
    public void user_go_to_login_page_and_go_to_password_recovery_page()
    {
        home=new homePage();
        home.usergotologinpage().click();
        login=new LoginPage();
        login.ForgotpasswordBtn().click();
    }
    @When("user enter valid email")
    public void user_enter_valid_email()
    {
        pass=new PasswordRecoverPage();
        pass.recoverPassword().sendKeys(Email);

    }
    @Then("user got Email with instructions")
    public void user_got_email_with_instructions()
    {
        pass.recoverbttn();
        Assert.assertTrue(pass.Result().isDisplayed());
    }
}
