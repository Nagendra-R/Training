package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeStep {
    HomePage homepage = new HomePage();


    @Given("user opens the website")
    public void user_opens_the_website() {

        homepage.openWebsite();
    }

    @Then("validate user is on the eBay home page")
    public void validate_user_is_on_the_e_bay_home_page() {
        Assert.assertTrue("User is not on Homepage",homepage.validateUserOnHomepage());
    }

    @When("user searches for {string} on the home page")
    public void user_searches_for_on_the_home_page(String item) {
        homepage.searchForItem(ConfigReader.getConfigValue(item));
    }

}
