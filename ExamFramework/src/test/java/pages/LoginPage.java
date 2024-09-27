package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@name='username']")
    WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passWord;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;

    public void openWebsite(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void enterDetails(String username,String password){
        userName.sendKeys(username);
        passWord.sendKeys(password);
    }

    public void clickOnSubmit(){
        submitButton.click();
    }
}
