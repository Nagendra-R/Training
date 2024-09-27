package com.automation;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

import java.util.List;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class EbayPrintPrice {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser =  playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
// Create a new page inside context.
//        Page newPage = browser.newPage();

        page.navigate("https://www.ebay.com/");

        Locator searchButton = page.locator("#gh-btn");
        assertThat(searchButton).isVisible();
        page.locator("#gh-as-a").click();

        Locator isFindItemsText = page.locator("//div[text()='Find items']");
        assertThat(isFindItemsText).isVisible();

        Locator itemField = page.locator("#_nkw");
        itemField.fill("Java");

        page.selectOption("select[aria-label='In this category']",new SelectOption().setLabel("Books & Magazines"));

        Locator minPriceInput = page.locator("//input[contains(@aria-label, 'minimum price')]");
        Locator maxPriceInput  = page.locator("//input[contains(@aria-label, 'maximum price')]");
        minPriceInput.fill(String.valueOf(0));
        maxPriceInput.fill(String.valueOf(100));


        page.selectOption("select[aria-label='Available to ']",new SelectOption().setLabel("India"));

        page.locator("//div[@class='adv-form__actions']/button").click();

        Locator firstItem = page.locator("(//span[@role='heading'])[3]");
        assertThat(firstItem).isVisible();
        firstItem.click();

        // Get page after a specific action (e.g. clicking a link)
        Page newTab = page.context().newPage().waitForPopup(() -> {
            firstItem.click();
        });


        Locator itemPrice = newTab.locator("//div[@class='x-price-primary']/span");
        System.out.println(itemPrice.allInnerTexts());



    }
}
