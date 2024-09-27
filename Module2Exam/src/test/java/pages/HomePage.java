package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class HomePage extends BasePage {

//    @FindBy()
//    WebElement


    public void openWebsite() {
        driver.get("https://www.demoblaze.com/");
    }

    public void validateOnHomepage() {

    }


    public void clickOnSignup() {
    }

    public void fillUsernameAndPassword(String username, String password) {
    }

    public void userClicksSignupButton() {
    }

    public void userSuccessfullySignup() {
    }
}
