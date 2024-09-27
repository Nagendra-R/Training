package com.automation.steps;

import com.automation.pages.CheckoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutStep {

    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("validate user is on the checkout page")
    public void validateUserIsOnTheCheckoutPage() {
        Assert.assertTrue("Checkout Page is not visible",checkoutPage.validateCheckoutPage());
    }

    @Then("validate amount on checkout page")
    public void validateAmountOnCheckoutPage() {
        Assert.assertTrue("Price is not equal",checkoutPage.validateFinalAmount());
    }

    @When("close the new open window")
    public void closeTheNewOpenWindow() {
        checkoutPage.closeWindow();
    }
}
