package com.automation.steps;

import com.automation.pojo.CreateToken;
import com.automation.utils.ConfigReader;
import com.automation.utils.RestAssuredUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequestSteps {

    @Given("user wants to call {string} end point")
    public void user_wants_to_call_end_point(String endPoint) {
        if(endPoint.contains("@id")){
            String addBookingId = ConfigReader.getConfigValue("booking.id");
            endPoint = endPoint.replace("@id", addBookingId);
        }
        RestAssuredUtils.setEndPoint(endPoint);
    }

    @When("set header {string} to {string}")
    public void set_header_to(String key, String value) {
        RestAssuredUtils.setHeader(key, value);
    }

    @And("set request body from {string}")
    public void set_request_body_from(String fileName) {
        RestAssuredUtils.setBody(fileName);
    }

    @When("user performs post call")
    public void user_performs_post_call() {
        RestAssuredUtils.post();
    }


    @When("user performs get call")
    public void userPerformsGetCall() {
        RestAssuredUtils.get();
    }

    @And("store token value to {string}")
    public void storeTokenValueTo(String key) {
        String value = RestAssuredUtils.getResponse().jsonPath().getString("token");
        ConfigReader.setConfigValue(key,value);

    }

    @And("user performs put call")
    public void userPerformsPutCall() {
        RestAssuredUtils.put();
    }

    @And("set request body from the file {string} with username {string} and password {string}")
    public void setRequestBodyFromTheFileWithUsernameAndPassword(String fileName, String username, String password) throws JsonProcessingException {
        String jsonFolderPath = ConfigReader.getConfigValue("json.folder.path");
        String content = RestAssuredUtils.getDataFromFile(jsonFolderPath+fileName);

        ObjectMapper om = new ObjectMapper();
        CreateToken createToken = om.readValue(content, CreateToken.class);
        createToken.setUsername(username);
        createToken.setPassword(password);
        RestAssuredUtils.setBodyUsingPojo(createToken);

    }
}
