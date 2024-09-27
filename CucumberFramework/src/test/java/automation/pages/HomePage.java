package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomePage extends BasePage{

    @FindBy(id="react-burger-menu-btn")
    WebElement burgerMenuIcon;

    @FindBy(id="logout_sidebar_link")
    WebElement logoutLink;

    @FindBy(xpath="//select[@class='product_sort_container']")
    WebElement dropDownButton;

    @FindBy(xpath = "//div[@class='inventory_item_name ']")
    List<WebElement> listOfDescOrderStrings;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    List<WebElement> listOfPricesLowToHigh;

    public boolean checkPriceIsSorted(){
        List<Double> listOfPrice = new ArrayList<>();
        for (WebElement eachPrice:listOfPricesLowToHigh){
            listOfPrice.add(Double.parseDouble(eachPrice.getText().substring(1)));
        }

        List<Double> updatedPriceSecondList = new ArrayList<>(listOfPrice);
        Collections.sort(updatedPriceSecondList);

        return listOfPrice.equals(updatedPriceSecondList);

    }





    public void clickOnLowToHighPrice(){
        Select lowToHighPrice = new Select(dropDownButton);
        lowToHighPrice.selectByVisibleText("Price (low to high)");
    }



    public boolean descOrderList(){
        List<String> list1 = new ArrayList<>();
        for(WebElement eachItem:listOfDescOrderStrings){
            list1.add(eachItem.getText());
        }

        List<String> list2 = new ArrayList<>(list1);

        list2.sort(Collections.reverseOrder());
        return list1.equals(list2);

    }

    public void clickOnZToAButton(){
        Select sortZToAButton = new Select(dropDownButton);
        sortZToAButton.selectByVisibleText("Name (Z to A)");
    }





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
