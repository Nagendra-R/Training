package com.automation.test;

import com.automation.page.HomePage;
import com.automation.page.LoginPage;
import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class OrangeHRM  extends BaseTest{

    @Test
    public void verifyAtLeastOneUserIsPresentInTheList(){


        LoginPage loginPage = new LoginPage();
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getProperty("login.username"),ConfigReader.getProperty("login.password"));
        HomePage homePage= new HomePage();
        homePage.clickOnAdminMenu();
        homePage.clickOnSelectAdmin();
        homePage.clickOnAdminButtonInsideSelectButton();
        homePage.clickOnSearchButton();
        Assert.assertTrue(homePage.validateNoOfAdminUsers(),"no of admin users are<1");


















//        WebDriver driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//
//        WebElement username = driver.findElement(By.xpath("//form/div[1]/div/div[2]/input"));
//        WebElement password = driver.findElement(By.xpath("//form/div[2]/div/div[2]/input"));
//
//        WebElement loginButton = driver.findElement(By.xpath("//button"));
//
//        username.sendKeys("Admin");
//        password.sendKeys("admin123");
//        loginButton.click();
//
//        WebElement adminButton = driver.findElement(By.xpath("//span[text()='Admin']"));
//        adminButton.click();
//
////        WebElement selectButton = driver.findElement(By.xpath("//form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
////        selectButton.click();
////        Select dropDown = new Select(driver.findElement(By.xpath("//form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")));
////        dropDown.selectByVisibleText("Admin");
//
//
//
//        WebElement selectButton = driver.findElement(By.xpath("//div[2]/div/div[2]/div/div/div[2]/i"));
//        selectButton.click();
//
//        WebElement searchBut = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]"));
//        searchBut.click();
//        driver.findElement(By.xpath("//button[contains(@class,'secondary orangehrm')]")).click();
//
////       List<WebElement> noOfAdminUsers = (List<WebElement>) driver.findElement(By.cssSelector(".oxd-icon bi-trash"));
//
////        System.out.println(noOfAdminUsers);
//        List<WebElement> noOfAdminUsers = driver.findElements(By.className("oxd-table-card"));
//        Assert.assertTrue(noOfAdminUsers.size()>=1,"no. of admin users are <1");

    }
}