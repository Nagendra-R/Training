package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage {

    public boolean checkCart() {
        WebElement addToCartButton = DriverManager.getDriver().findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();
        WebElement removeButton = DriverManager.getDriver().findElement(By.id("remove-sauce-labs-backpack"));
        String removeButtonText = removeButton.getText();
        int cartIconBadge = Integer.parseInt(DriverManager.getDriver().findElement(By.className("shopping_cart_badge")).getText());
        return (removeButtonText.equals("Remove") && (cartIconBadge == 1));
    }

}
