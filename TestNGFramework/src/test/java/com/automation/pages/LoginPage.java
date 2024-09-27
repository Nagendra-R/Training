package com.automation.pages;

import com.automation.test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id="user-name")
    WebElement usernameInput;

    @FindBy(id="password")
     WebElement passwordInput;

    @FindBy(id="login-button")
     WebElement loginButton;




    public void openWebsite(){
        driver.get("https://www.saucedemo.com/");
    }

    public void doLogin(String userName,String passWord){
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(passWord);
        loginButton.click();

    }

    public boolean isHomepageDisplayed(){

        WebElement filterDropDown = driver.findElement(By.cssSelector(".product_sort_container"));
        WebElement cartIcon = driver.findElement(By.cssSelector(".shopping_cart_link"));
        return (filterDropDown.isDisplayed() && cartIcon.isDisplayed());
    }
}
