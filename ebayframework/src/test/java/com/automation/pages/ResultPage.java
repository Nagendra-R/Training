package com.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage{

//    @FindBy(xpath = "//h2[text()='RAM Size']")
//    WebElement ramSizeText;

    @FindBy(xpath="//*[@id=\"item44fc060b7f\"]/div/div[1]/div/a/div/img")
    WebElement imgLink;

    @FindBy(xpath = "//h1[@class='srp-controls__count-heading']/span[2][@class='BOLD']")
    WebElement validResultData;



    public boolean validateResultPage() {
        return validResultData.isDisplayed();
    }


    public void clickOnFirstSuggestedItem() {
        imgLink.click();
        driver.switchTo().window(driver.getWindowHandles().stream().toList().get(1));
    }




}
