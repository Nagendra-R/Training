package com.automation.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage extends BasePage{
    Locator searchInput;
    Locator searchButton;

    public HomePage() {
        searchInput = page.getByPlaceholder("Search AJIO");
        searchButton = page.locator(".ic-search");
    }

    public void openWebsite() {
        page.navigate("https://www.ajio.com/");
    }

    public Locator searchBar() {
        return searchButton;
    }

    public void searchWithItem(String item) {
        searchInput.fill(item);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }
}
