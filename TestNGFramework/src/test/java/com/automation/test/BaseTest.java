package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class BaseTest {

    LoginPage loginPage;
    HomePage homePage;

    private static ExtentReports extentReport;
    public static ExtentTest test;
    private static ExtentSparkReporter sparkReporter;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        //Set up Reporter
        String reportPath = System.getProperty("user.dir")+"\\reports\\extentReports.html";
        sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.config().setTheme(Theme.DARK);
        ConfigReader.initProperties();
        extentReport = new ExtentReports();
        test = extentReport.createTest("verify user can login");
        test.info("Navigate to another page");

            DriverManager.createDriver();
        loginPage = new LoginPage();
        homePage = new HomePage();

    }


    @AfterMethod
    public void cleanUp() {
        extentReport.attachReporter(sparkReporter);
        extentReport.flush();
        DriverManager.getDriver().close();
    }



    public static String takeScreenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        File file = ts.getScreenshotAs(OutputType.FILE);
        String filePath = "src/test/resources" + "/screenshot.png";
        FileUtils.copyFile(file, new File(filePath));
        return System.getProperty("user.dir") + filePath;
    }

}
