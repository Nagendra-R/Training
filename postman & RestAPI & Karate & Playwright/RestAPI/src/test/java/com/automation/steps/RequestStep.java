package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.RestAssuredUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RequestStep {


    @Given("user wants to call {string} end point")
    public void user_wants_to_call_end_point(String endPoint) {

        if(endPoint.contains("username")){
            String addUserName = ConfigReader.getConfigValue("username");
            endPoint = endPoint.replace("username", addUserName);
        }

        RestAssuredUtils.setEndPoint(endPoint);
    }

    @When("set header {string} to {string}")
    public void set_header_to(String key, String value) {
        RestAssuredUtils.setHeader(key, value);
    }

    @When("set request body from {string}")
    public void set_request_body_from(String fileName) {
        RestAssuredUtils.setBody(fileName);
    }

    @When("user performs post call")
    public void user_performs_post_call() {
        RestAssuredUtils.post();
    }

    @And("user performs put call")
    public void userPerformsPutCall() {
        RestAssuredUtils.put();
    }


    @Then("verify status is {int}")
    public void verify_status_is(int statusCode) {
//        RestAssuredUtils.getResponse().then().log().all();
        Assert.assertEquals(statusCode, RestAssuredUtils.getResponse().statusCode());
    }


    @And("user performs get call")
    public void userPerformsGetCall() {
        RestAssuredUtils.get();
    }
}
