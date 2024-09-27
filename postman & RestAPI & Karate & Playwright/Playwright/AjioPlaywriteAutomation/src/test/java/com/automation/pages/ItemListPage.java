package com.automation.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.LoadState;
import com.microsoft.playwright.options.WaitUntilState;

import java.util.List;


public class ItemListPage extends BasePage {

    List<Locator> listOfItems;
    Locator priceButton;
    Locator minPriceField;
    Locator maxPriceField;
    Locator submitMinMaxButton;
    List<Locator> listOfPrices;
    Locator searchText;


    public ItemListPage() {
        page.waitForLoadState(LoadState.LOAD);
        listOfItems = page.locator(".nameCls").all();
        searchText = page.locator(".header2");
        priceButton = page.locator("//span[@aria-label='price']");
        minPriceField = page.locator("#minPrice");
        maxPriceField = page.locator("#maxPrice");
        submitMinMaxButton = page.locator("//div[@class='facet-min-price-filter']/button");
        listOfPrices = page.locator("//span[@class='price  ']/strong").all();
    }

    public boolean verifyEachItemWithSearchItem(String item) {
        for (int i = 0; i < 10; i++) {
            System.out.println();
            if (!listOfItems.get(i).innerText().contains(item)) {
                return false;
            }
        }
        return true;
    }


    public void fillTheMinAndMaxAmount(String min, String max) {
        priceButton.click();
        minPriceField.fill(min);
        maxPriceField.fill(max);
        submitMinMaxButton.click();
        page.waitForLoadState(LoadState.LOAD);

        Locator someElement = page.locator(".brand");
        someElement.waitFor();


//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

    }

    public boolean verifyThePriceBetweenMinAndMax() {

        for (int i = 0; i < 10; i++) {
            String eachPrice = listOfPrices.get(i).innerText();
            System.out.println("===>" + eachPrice);
            double itemPrice = Double.parseDouble(eachPrice.substring(1).replace(",", ""));
            if (!(itemPrice >= 600 && itemPrice <= 1200)) {
                return false;
            }
        }
        return true;
    }

    public Locator verifyUserOnShirtsPage() {
        System.out.println(searchText.innerText());
        return searchText;
    }
}
