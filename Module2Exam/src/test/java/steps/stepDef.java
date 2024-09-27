package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.ConfigReader;

public class stepDef {

    HomePage homePage = new HomePage();

    @Given("user open the website")
    public void user_open_the_website() {
        homePage.openWebsite();
    }

//    @Then("validate user on home page")
//    public void validate_user_on_home_page() {
//        homePage.validateOnHomepage();
//    }
//
//    @When("user click on sign up click")
//    public void user_click_on_sign_up_click() {
//        homePage.clickOnSignup();
//    }
//
//    @And("user fill the {string} and {string}")
//    public void user_fill_the_and(String username, String password) {
//        homePage.fillUsernameAndPassword(ConfigReader.configValue(username),ConfigReader.configValue(password));
//    }
//
//    @And("user click on sign up button")
//    public void user_click_on_sign_up_button() {
//        homePage.userClicksSignupButton();
//    }
//
//    @Then("user validate sign up successfully")
//    public void user_validate_sign_up_successfully() {
//        homePage.userSuccessfullySignup();
//    }

}
