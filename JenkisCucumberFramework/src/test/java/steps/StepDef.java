package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.*;
import utils.ConfigReader;

import java.util.Random;

public class StepDef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage =new HomePage();
    ProjectPage projectPage = new ProjectPage();
    ConfigurePage configurePage = new ConfigurePage();
    FinalPage finalPage = new FinalPage();



    @Given("user open the localhost8080")
    public void user_open_the_localhost8080() {
        loginPage.openWebsite();
    }

    @Then("validate user on loginPage")
    public void validate_user_on_login_page() {
        Assert.assertTrue("LoginPage is not Displayed",loginPage.validateUserOnLoginPage());
    }

    @Then("user enter the {string} and {string}")
    public void user_enter_the_and(String username, String password) {
        loginPage.doLogin(ConfigReader.getConfigValue(username),ConfigReader.getConfigValue(password));
    }


    @Then("user click the login button")
    public void user_click_the_login_button() {
        loginPage.clickOnSubmitButton();
    }

    @Then("validate user on homepage on jenkins")
    public void validate_user_on_homepage_on_jenkins() {
            Assert.assertTrue("Homepage is not Displayed",homePage.validateUserOnHomePage());
    }

    @When("user click on new item")
    public void user_click_on_new_item() {
            homePage.clickOnNewItem();
    }


    @Then("validate user on project file")
    public void validate_user_on_project_file() {
        projectPage.validateProjectPage();
    }

    @Given("user enter random string as item name")
    public void user_enter_random_string_as_item_name() {
        projectPage.inputItemNameAndClickFreeStyleProjectAndOkButton();
    }

    @Then("validate user on configure file")
    public void validate_user_on_configure_file() {
            Assert.assertTrue("ConfigurePage is not displayed",configurePage.ValidateConfigurePage());
    }

    @When("user click on file radio button")
    public void user_click_on_file_radio_button() {
        configurePage.clickOnFileRadioButton();
    }

    @When("user pass the path {string}")
    public void user_pass_the_path(String localPath) {
        configurePage.passTheLocalPath(localPath);
    }

    @When("user click on addBuildPathDropDown")
    public void user_click_on_add_build_path_drop_down() {
        configurePage.clickOnAddBuildStepsDropDown();
    }

    @When("user select the top level maven")
    public void user_select_the_top_level_maven() {
        configurePage.clickOnTopLevelMaven();
    }

    @When("user pass {string} to topLevelMaven")
    public void user_pass_to_top_level_maven(String goalsText) {
        configurePage.passTheGoalsText(ConfigReader.getConfigValue(goalsText));
    }

    @When("user click on save button")
    public void user_click_on_save_button() {
        configurePage.clickOnSaveButton();
    }


    @Then("validate user finishes the project")
    public void validate_user_finishes_the_project() {
        Assert.assertTrue("project not saved",finalPage.validateSaveProject());
    }
}
