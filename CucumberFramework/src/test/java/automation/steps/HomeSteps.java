package automation.steps;

import automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.Select;

public class HomeSteps {

    HomePage homePage = new HomePage();


//    @RunWith()

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        homePage.isHomepageDisplayed();
    }


    @When("user click on the name ZToaA button")
    public void userClickOnTheNameZToaAButton() {
        homePage.clickOnZToAButton();
    }

    @Then("verify user is sorted in descending order")
    public void verifyUserIsSortedInDescendingOrder() {
        Assert.assertTrue(homePage.descOrderList());

    }

    @When("user click on price low to high")
    public void userClickOnPriceLowToHigh() {
        homePage.clickOnLowToHighPrice();
    }

    @Then("verify the price is sort in ascending order")
    public void verifyThePriceIsSortInAscendingOrder() {
        Assert.assertTrue(homePage.checkPriceIsSorted());
    }
}
