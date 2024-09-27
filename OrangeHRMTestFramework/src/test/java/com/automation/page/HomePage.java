package com.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath="//span[text()='Admin']")
    WebElement adminMenu;

    @FindBy(xpath = "//div[2]/div/div[2]/div/div/div[2]/i")
    WebElement selectAdmin;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[2]")
    WebElement adminButtonInsideSelectButton;

    @FindBy(xpath = "//button[contains(@class,'secondary orangehrm')]")
    WebElement searchButton;



    public void clickOnAdminMenu(){
        adminMenu.click();
    }

    public void clickOnSelectAdmin(){
        selectAdmin.click();
    }

    public void clickOnAdminButtonInsideSelectButton(){
        adminButtonInsideSelectButton.click();
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }


    public boolean validateNoOfAdminUsers(){
        List<WebElement> noOfAdminUsers = driver.findElements(By.className("oxd-table-card"));
        return noOfAdminUsers.size()>=1;
//        Assert.assertTrue(noOfAdminUsers.size()>=1,"no. of admin users are <1");
    }













}
