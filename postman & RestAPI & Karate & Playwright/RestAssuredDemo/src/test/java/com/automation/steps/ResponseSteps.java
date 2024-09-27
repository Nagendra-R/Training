package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.RestAssuredUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ResponseSteps {

    @Then("verify status is {int}")
    public void verify_status_is(int statusCode) {
        RestAssuredUtils.getResponse().then().log().all();
        Assert.assertEquals(statusCode, RestAssuredUtils.getStatusCode());
    }


    @Then("verify status is {int} and response is not empty")
    public void verifyStatusIsAndResponseIsNotEmpty(int statusCode) {
        Assert.assertEquals(statusCode,RestAssuredUtils.getStatusCode());
        Assert.assertFalse(RestAssuredUtils.isEmptyResponse());
    }

    @And("verify booking id is not empty")
    public void verifyBookingIdIsNotEmpty() {
        String id = RestAssuredUtils.getResponse().jsonPath().getString("bookingid");
        assertFalse(id.isEmpty());
    }

    @When("stores created booking id into {string}")
    public void storesCreatedBookingIdInto(String key) {
         String value = RestAssuredUtils.getResponse().jsonPath().getString("bookingid");
         ConfigReader.setConfigValue(key,value);
    }

    @Then("verify response message is {string}")
    public void verifyResponseMessageIs(String message) {
        Assert.assertEquals(message,RestAssuredUtils.getResponse().jsonPath().getString("reason"));
    }
}



