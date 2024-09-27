package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "j_username")
    WebElement usernameHolder;

    @FindBy(id = "j_password")
    WebElement passwordHolder;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement signInButton;

    public void openWebsite() {
        driver.get("http://localhost:8080/");

    }

    public boolean validateUserOnLoginPage() {
        return signInButton.isDisplayed();
    }

    public void doLogin(String username, String password) {
        usernameHolder.clear();
        passwordHolder.clear();
        usernameHolder.sendKeys(username);
        passwordHolder.sendKeys(password);

    }

    public void clickOnSubmitButton() {
        signInButton.click();
    }




}
