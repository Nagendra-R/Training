package com.automation.test;

import com.automation.page.HomePage;
import com.automation.page.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp(){
        ConfigReader.initProperties();
        DriverManager.createDriver();
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @AfterMethod
    public void cleanUp(){
        DriverManager.getDriver().close();
    }
}
