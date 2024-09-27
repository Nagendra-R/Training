package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class ConfigurePage extends BasePage {
    @FindBy(xpath ="//h1[text()='Configure']")
    WebElement checkConfigureText;

    @FindBy(xpath = "//label[@for='radio-block-1']")
    WebElement filePathRadioButton;

    @FindBy(xpath="//input[@name='_.path']")
    WebElement filePath;

    @FindBy(xpath = "//button[text()='Add build step']")
    WebElement addBuildPath;

    @FindBy(xpath = "//div[@class='jenkins-dropdown jenkins-dropdown--compact']/button[5]")
    WebElement topLevelMavenTargets;

    @FindBy(id = "textarea._.targets")
    WebElement goalsText;

    @FindBy(xpath="//button[contains(text(),'Save')]")
    WebElement saveButton;



    public boolean ValidateConfigurePage() {
        return checkConfigureText.isDisplayed();
    }

    public void clickOnFileRadioButton() {
        JavascriptExecutor jsGitRadio = (JavascriptExecutor) driver;
        jsGitRadio.executeScript("arguments[0].click();",filePathRadioButton);

    }

    public void passTheLocalPath(String localPath) {
        filePath.sendKeys(localPath);
    }

    public void clickOnAddBuildStepsDropDown() {
        JavascriptExecutor jsAddBuildSteps = (JavascriptExecutor) driver;
        jsAddBuildSteps.executeScript("arguments[0].click();",addBuildPath);
//        addBuildPath.click();
    }

    public void clickOnTopLevelMaven() {
        JavascriptExecutor jsTopLevelMaven = (JavascriptExecutor) driver;
        jsTopLevelMaven.executeScript("arguments[0].click();",topLevelMavenTargets);
//        topLevelMavenTargets.click();
    }

    public void passTheGoalsText(String goalsValue) {
        goalsText.sendKeys(goalsValue);
    }

    public void clickOnSaveButton() {
        saveButton.click();
    }

}
