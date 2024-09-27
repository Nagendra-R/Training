package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemResultPage extends BasePage{

    @FindBy(xpath = "//span[text()='Add to cart']")
    WebElement addToCheckoutButton;

    public boolean userOnItemResultPage() {
        return addToCheckoutButton.getText().equals("Add to cart");
    }


    public void clickOnAddToCart() {
        addToCheckoutButton.click();
    }
}
