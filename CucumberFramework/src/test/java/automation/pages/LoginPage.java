package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class LoginPage extends BasePage{

    @FindBy(id="user-name")
    WebElement usernameInput;

    @FindBy(id="password")
     WebElement passwordInput;

    @FindBy(id="login-button")
     WebElement loginButton;

    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errMessageInLoginPage;





    public void openWebsite(){
        driver.get("https://www.saucedemo.com/");
    }

    public void doLogin(String userName,String passWord){
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(passWord);
        loginButton.click();
    }

    public boolean isLoginPageDisplayed(){
        return usernameInput.isDisplayed();

    }

    public String getInvalidErrMsg(){
        return errMessageInLoginPage.getText();
    }
}
