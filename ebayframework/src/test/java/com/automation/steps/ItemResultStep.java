package com.automation.steps;

import com.automation.pages.ItemResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ItemResultStep {

    ItemResultPage itemResultPage = new ItemResultPage();

    @Then("validate user is on the item details page")
    public void validate_user_is_on_item_details_page() {
        Assert.assertTrue("user is not on item result page",itemResultPage.userOnItemResultPage());
    }

    @When("user clicks on the add to cart button")
    public void userClicksOnTheAddToCartButton() {
        itemResultPage.clickOnAddToCart();
    }






}
