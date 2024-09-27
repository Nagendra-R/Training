package com.automation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ActionClassDemo {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.ebay.com/");


        //inputText
        page.locator("//input[@placeholder='Search for anything']").fill("laptops");

        //mouse click
        page.locator("#gh-btn").click();

        //checkBox for 16 gb
        page.locator("//input[@aria-label='16 GB']").click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //select the option
        page.getByLabel("Select a category for search").selectOption("All Categories");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //pressSequentially
        page.locator("#gh-ac").clear();
        page.locator("#gh-ac").pressSequentially("Computers");
        page.getByPlaceholder("Search").press("Enter");
        System.out.println("clicked the search button");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        page.locator("#gh-ac").clear();
        page.locator("#gh-ac").focus();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        page.close();








        //focus on element
//        page.locator("(//span[@class='s-item__price'])[3]").focus();

        //  hit enter
















    }
}
