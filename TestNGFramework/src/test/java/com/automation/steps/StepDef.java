package com.automation.steps;

import com.automation.pages.DataSetPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class StepDef {
    @Given("user open website")
    public void user_open_website() {

    }

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {

    }

    @When("user login with valid credentials")
    public void user_login_with_valid_credentials() {

    }

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {

    }

    @When("user click on the burger icon")
    public void user_click_on_the_burger_icon() {

    }
    @When("click on logout button")
    public void click_on_logout_button() {

    }


    @When("user login with invalid credentials")
    public void userLoginWithInvalidCredentials() {
        
    }

    @Then("verify the error message with invalid credentials")
    public void verifyTheErrorMessageWithInvalidCredentials() {
    }

    @When("user login with username {string} and password {string}")
    public void userLoginWithUsernameAndPassword(String username, String password) {
    }



    @Given("user open table website")
    public void user_open_table_website() {
        DataSetPage dataSetPage = new DataSetPage();
        dataSetPage.openWebsite();
    }


    @Then("verify following data displayed on homepage")
    public void verify_following_data_displayed_on_homepage(List<List<String>> dataTable) {
        DataSetPage dataSetPage = new DataSetPage();
        dataSetPage.validateTableData(dataTable);

//        List<List<String>> tableData = dataTable;
//        for (List<String> listOfRows : tableData){
//            for (String eachRow:listOfRows){
//                System.out.print(eachRow +"  ");
//            }
//            System.out.println();
//        }


    }




}
