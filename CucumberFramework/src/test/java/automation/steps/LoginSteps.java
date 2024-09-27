package automation.steps;

import automation.pages.LoginPage;
import automation.utils.ConfigReader;
import automation.utils.ReportManager;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();


    @Given("user opens the website")
    public void user_opens_the_website() {
        loginPage.openWebsite();
    }

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {

        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String usernameKey, String passwordKey) {
        loginPage.doLogin(ConfigReader.getConfigValue(usernameKey), ConfigReader.getConfigValue(passwordKey));
    }

    @Then("verify locked out user error message is displayed as below")
    public void verify_locked_out_user_error_message_is_displayed_as_below(String errMsg) {
        Assert.assertTrue(loginPage.getInvalidErrMsg().contains(errMsg));

    }


    @When("user enters with every {string} and {string}")
    public void userEntersWithEveryAnd(String username, String password) {
        loginPage.doLogin(username,password);
    }
}
