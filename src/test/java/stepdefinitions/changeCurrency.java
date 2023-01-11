package stepdefinitions;

import Pages.homePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class changeCurrency {

    homePage home;
    @When("user change currency")
    public void user_change_currency()
    {
        home=new homePage();
        home.userCanChangeCurrency();
    }
    @Then("All pages will have new currency")
    public void all_pages_will_have_new_currency()
    {
        home.ScroLLBottom();
        Assert.assertTrue(home.price.getText().contains("€"));
    }
}
