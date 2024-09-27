package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends BasePage{

    @FindBy(xpath="//input[@id='gh-ac']")
    WebElement searchKey;

    @FindBy(xpath = "//input[@class='btn btn-prim gh-spr']")
    WebElement searchButton;


    public void openWebsite() {
        driver.get("https://www.ebay.com/");
    }

    public boolean validateUserOnHomepage() {
        return  searchKey.isDisplayed() && searchButton.isDisplayed();
    }


    public void searchForItem(String item) {
        searchKey.clear();
        searchKey.sendKeys(item);
        searchButton.click();

    }

}
