package com.automation;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;
import com.microsoft.playwright.options.SelectOption;

import java.util.List;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ExpediaSortByPrice {
    public static void main(String[] args) {
        String leavingFrom = "Hyderabad";
        String goingTo = "Delhi";
        String currentDate = "10";
        String returnDate = "15";

        int noOfAdults = 4;
        int noOfChildren = 2;
        int child1Age = 10;
        int child2Age = 13;

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.expedia.co.in/");

        Locator flightText = page.locator("//span[text()='Flights']");
        flightText.click();

        Locator searchButton = page.locator("#search_button");
        assertThat(searchButton).isVisible();

        Locator leavingFromInput = page.locator("//button[@aria-label='Leaving from']");
        leavingFromInput.click();
        Locator leavingAirportInput = page.locator("#origin_select");
        leavingAirportInput.fill(leavingFrom);
        Locator leavingPlace = page.locator("(//button[@data-stid='origin_select-result-item-button'])[1]");
        leavingPlace.click();

        Locator goingToInput = page.locator("//button[@aria-label='Going to']");
        goingToInput.click();
        Locator destinationAirportInput = page.locator("#destination_select");
        destinationAirportInput.fill(goingTo);
        Locator destinationPlace = page.locator("(//button[@data-stid='destination_select-result-item-button'])[1]");
        destinationPlace.click();

        Locator selectDates = page.locator("//button[@data-testid='uitk-date-selector-input1-default']");
        selectDates.click();
        String locD1 = "(//div[@class='uitk-day-button uitk-day-selectable uitk-day-clickable'])[%s]";
        String xPathFromDate = String.format(locD1,currentDate);
        Locator fromDate = page.locator(xPathFromDate);
        fromDate.click();

        String locD2 = "(//div[@class='uitk-day-button uitk-day-selectable uitk-day-clickable'])[%s]";
        String xPathToDate = String.format(locD2,returnDate);
        Locator toDate = page.locator(xPathToDate);
        toDate.click();
        Locator doneButton = page.locator("//button[@data-stid='apply-date-selector']");
        doneButton.click();

        Locator travellerButton = page.locator("//button[@data-stid='open-room-picker']");
        travellerButton.click();
        Locator adultValueAttribute = page.locator("#traveler_selector_adult_step_input");
        int adultValue = Integer.parseInt(adultValueAttribute.getAttribute("value"));
        while(noOfAdults != adultValue){
            Locator incrementButton = page.locator("(//span[@class='uitk-step-input-button'])[2]");
            incrementButton.click();
            adultValueAttribute = page.locator("#traveler_selector_adult_step_input");
            adultValue = Integer.parseInt(adultValueAttribute.getAttribute("value"));
        }
        System.out.println(adultValue);
        Locator initialChildValueText = page.locator("#traveler_selector_children_step_input");
        int initialValue = Integer.parseInt(initialChildValueText.getAttribute("value"));
        while(initialValue != noOfChildren){
            Locator incrementButton = page.locator("(//span[@class='uitk-step-input-button'])[4]");
            incrementButton.click();
            initialChildValueText = page.locator("#traveler_selector_children_step_input");
             initialValue = Integer.parseInt(initialChildValueText.getAttribute("value"));
        }




        page.selectOption("select[id='age-traveler_selector_children_age_selector-0']",new SelectOption().setLabel(String.valueOf(child1Age)));
        page.selectOption("select[id='age-traveler_selector_children_age_selector-1']",new SelectOption().setLabel(String.valueOf(child2Age)));

        Locator doneButton2 = page.locator("#travelers_selector_done_button");
        doneButton2.click();
        searchButton.click();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertThat(page.getByPlaceholder("select-link")).isVisible();

        Locator generalAmountText = page.locator("(//span[@class='uitk-date-range-button-text'])[4]");
        String normalAmount = generalAmountText.innerText();

        page.selectOption("#sort-filter-dropdown-SORT",new SelectOption().setLabel("Price (lowest to highest)"));
        Locator lowestFLightText = page.locator("(//button[@data-test-id='select-link']/span)[1]");
        String totalText = lowestFLightText.innerText();
        if(totalText.contains(normalAmount)){
            System.out.println(normalAmount);
        }



//        Locator child1Locator = page.locator("(//select[@class='uitk-field-select'])[1]");
//        Locator child2Locator = page.locator("(//select[@class='uitk-field-select'])[2]");
//        validateChildAge(child1Locator,noOfChildren,child1Age);
//        validateChildAge(child2Locator,noOfChildren,child2Age);





        try {
            Thread.sleep(2384);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

//    private static void validateChildAge(Locator locator,int noOfChildren, int child1Age) {
//        locator.click();
//
//
//    }
}
