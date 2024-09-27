package com.automation.steps;

import com.automation.pages.ItemListPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ItemListStep {

    ItemListPage itemListPage= new ItemListPage();


    @Then("verify the items shown contains the {string}")
    public void verify_the_items_shown_contains_the(String item) {
        if(itemListPage.verifyEachItemWithSearchItem(ConfigReader.getConfigValue(item))){

            System.out.println("everything is shirt");
        }else{
            System.out.println("Every item is not a shirt ");
        }
    }

    @Then("verify user on shirts item page")
    public void verifyUserOnShirtsItemPage() {
        assertThat(itemListPage.verifyUserOnShirtsPage()).isVisible();

    }

    @When("fill the min {string} and max {string} amount")
    public void fillTheMinAndMaxAmount(String min, String max) {
        itemListPage.fillTheMinAndMaxAmount(min,max);
    }

    @Then("validate the price is between min and max")
    public void validateThePriceIsBetweenMinAndMax() {
        if(itemListPage.verifyThePriceBetweenMinAndMax()){
            System.out.println("Each item price is in correct range");
        }else{
            System.out.println("Each item price is not in correct range");
        }
    }



}
