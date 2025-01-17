package com.automation;

import com.microsoft.playwright.*;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;
import java.util.List;

public class DemoClass {
    public static void main(String[] args) {

        try {
            Playwright playwright = Playwright.create();
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://www.saucedemo.com");
            Locator userNameInput = page.locator("#user-name");
            Locator passwordInput = page.locator("#password");
            Locator loginButton = page.locator("#login-button");
            userNameInput.fill("standard_user");
            passwordInput.fill("secret_sauce");
            loginButton.click();
            assertThat(page.locator("span.title")).hasText("Products");

//            List<Locator> listOfProducts = page.locator("//div[@class='inventory_item_name ']").all();
//            for (Locator locator : listOfProducts) {
//                System.out.println(locator.allInnerTexts());
//            }

            Locator addToCartButton = page.locator("#add-to-cart-sauce-labs-backpack");
            addToCartButton.click();
            Locator shopCartItemSymbol = page.locator("a.shopping_cart_link");
            shopCartItemSymbol.click();
            assertThat(page.locator("div.cart_quantity")).hasText("1");
            Locator checkOutButton = page.locator("#checkout");
            checkOutButton.click();

            assertThat(page.locator("#continue")).hasText("Continue");

            Locator firstNameInput = page.locator("#first-name");
            Locator lastNameInput = page.locator("#last-name");
            Locator zipPostalCode = page.locator("#postal-code");

            firstNameInput.fill("na peru");
            lastNameInput.fill("uu nagendra ..!!!");
            zipPostalCode.fill("naku teliyadhu ");
            page.locator("#continue").click();

            assertThat(page.locator("#finish")).hasText("Finish");
            Locator finishButton = page.locator("#finish");
            finishButton.click();

            assertThat(page.locator("h2.complete-header")).hasText("Thank you for your order!");


            Thread.sleep(2000);
            page.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("src/test/resources/image1.png")));
            page.close();
            System.out.println("execution finished and attached screenshot");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
