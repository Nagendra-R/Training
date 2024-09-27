package com.automation.steps;

import com.automation.pages.ResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ResultStep {
    ResultPage resultPage = new ResultPage();

    @Then("validate user is on the result page")
    public void validate_user_is_on_the_result_page() {
        Assert.assertTrue("Result page is not Displayed::",resultPage.validateResultPage());
    }


    @When("user click the first suggestion item")
    public void userClickTheFirstSuggestionItem() {
        resultPage.clickOnFirstSuggestedItem();
    }



}
