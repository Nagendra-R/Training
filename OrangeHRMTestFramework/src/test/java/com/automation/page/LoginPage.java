package com.automation.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.automation.utils.DriverManager.driver;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//form/div[1]/div/div[2]/input")
    WebElement userName;

    @FindBy(xpath = "//form/div[2]/div/div[2]/input")
    WebElement passWord;

    @FindBy(xpath = "//button")
    WebElement loginButton;




    public void openWebsite(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void doLogin(String username,String password){
            userName.sendKeys(username);
            passWord.sendKeys(password);
            loginButton.click();
    }



}
