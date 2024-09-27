package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomeStep {

    HomePage homePage = new HomePage();


    @Given("user open the website")
    public void user_open_the_website() {
        homePage.openWebsite();
    }

    @Then("verify user on home page")
    public void verify_user_on_home_page() {
        assertThat(homePage.searchBar()).isVisible();
    }

    @When("user search with {string}")
    public void user_search_with(String item) {
        homePage.searchWithItem(ConfigReader.getConfigValue(item));
    }

    @And("user click on the search button")
    public void userClickOnTheSearchButton() {
        homePage.clickOnSearchButton();
    }
}
