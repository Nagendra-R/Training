package com.automation.pages;

import com.automation.test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy(id="react-burger-menu-btn")
    WebElement burgerMenuIcon;

    @FindBy(id="logout_sidebar_link")
    WebElement logoutLink;



    public void clickOnBurgerMenu(){
        burgerMenuIcon.click();
    }

    public void clickOnLogoutButton(){
        logoutLink.click();
    }

    public boolean isHomepageDisplayed(){
        WebElement filterDropDown = driver.findElement(By.cssSelector(".product_sort_container"));
        WebElement cartIcon = driver.findElement(By.cssSelector(".shopping_cart_link"));

        return (filterDropDown.isDisplayed() && cartIcon.isDisplayed());
    }

    public boolean checkLogout(){
        WebElement checkSwagsLabs = driver.findElement(By.className("login_logo"));
        return checkSwagsLabs.getText().equals("Swag Labs");
    }


}
