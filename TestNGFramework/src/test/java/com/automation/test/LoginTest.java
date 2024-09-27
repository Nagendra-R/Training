package com.automation.test;

import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
//import com.automation.utils.ConfigReader;
import com.automation.utils.AllureReportManager;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class LoginTest extends BaseTest {


    @Test
    public void verifyUserCanLoginWithValidCredentials() throws IOException {

        LoginPage loginPage = new LoginPage();
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getProperty("login.username"), ConfigReader.getProperty("login.password"));
        AllureReportManager.attachScreenshot();
        HomePage homePage = new HomePage();
        test.addScreenCaptureFromPath(takeScreenshot());
        Assert.assertTrue(homePage.isHomepageDisplayed(), "Homepage is not Displayed Properly");

    }


//    @Test
//    public void addToCart(){
//
//        LoginPage loginPage = new LoginPage();
//        loginPage.openWebsite();
//        loginPage.doLogin(ConfigReader.getProperty("login.username"), ConfigReader.getProperty("login.password"));
//        CartPage cartPage = new CartPage();
//        Assert.assertTrue(cartPage.checkCart(),"Add to Cart is not working");
//
//
//    }
//
//
//    @Test
//    public void removeFromCart(){
//        LoginPage loginPage = new LoginPage();
//        loginPage.openWebsite();
//        loginPage.doLogin(ConfigReader.getProperty("login.username"), ConfigReader.getProperty("login.password"));
//        CartPage cartPage = new CartPage();
//        boolean checkStatus = cartPage.checkCart();
//        WebElement clickOnCart = DriverManager.getDriver().findElement(By.cssSelector(".shopping_cart_link"));
//        clickOnCart.click();
//        WebElement removeButton = DriverManager.getDriver().findElement(By.id("remove-sauce-labs-fleece-jacket"));
//        removeButton.click();
//
//    }


    @Test
    public void verifyUserCanLogout() {

        LoginPage loginPage = new LoginPage();
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getProperty("login.username"), ConfigReader.getProperty("login.password"));
        Assert.assertTrue(loginPage.isHomepageDisplayed(), "HomePage is not displayed");
        HomePage homePage = new HomePage();
        homePage.clickOnBurgerMenu();
        homePage.clickOnLogoutButton();
        Assert.assertTrue(homePage.checkLogout(), "Logout is unsuccessful");

    }

}
