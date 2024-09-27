package com.automation.pages;

import io.cucumber.java.eo.Do;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//button[text()='Go to checkout']")
    WebElement goToCheckoutButton;

    @FindBy(xpath = "//div[@data-test-id='ITEM_TOTAL']")
    WebElement itemPriceLocator;

    @FindBy(xpath = "//div[@data-test-id='SHIPPING']")
    WebElement shippingPriceLocator;

    @FindBy(xpath = "//div[@data-test-id='SUBTOTAL']")
    WebElement totalPriceLocator;


    public boolean validateCheckoutPage() {
        return goToCheckoutButton.isDisplayed();
    }

    public boolean validateFinalAmount() {
        double itemPrice = Double.parseDouble(itemPriceLocator.getText().split("\\$")[1]);
        double shippingPrice = Double.parseDouble(shippingPriceLocator.getText().split("\\$")[1]);
        double totalPrice = Double.parseDouble(totalPriceLocator.getText().split("\\$")[1]);
        System.out.println("total price::" + totalPrice);
        System.out.println("itemPrice+shippingPrice::" + (itemPrice + shippingPrice));
        return totalPrice == itemPrice + shippingPrice;
    }

    public void closeWindow() {
        driver.switchTo().window(driver.getWindowHandles().stream().toList().getFirst());
    }
}
