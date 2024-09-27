package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;

public class StepDef {

    LoginPage loginPage;
    HomePage homePage;


    @Given(": go to login page")
    public void go_to_login_page() {
        loginPage = new LoginPage();
        loginPage.openWebsite();
    }

    @And(": enter the {string} and {string}")
    public void enterTheAnd(String username, String password) {
        loginPage.enterDetails(ConfigReader.getConfigValue(username), ConfigReader.getConfigValue(password));
    }

    @When(": click on the submit button")
    public void click_on_the_submit_button() {
        loginPage.clickOnSubmit();
    }

    @Then(": validate user on home page")
    public void validate_user_on_home_page() {
        homePage = new HomePage();
        Assert.assertTrue("Homepage is not getting", homePage.validateOnHomePage());
    }


}
