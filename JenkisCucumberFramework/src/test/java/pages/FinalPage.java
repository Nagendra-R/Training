package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalPage extends BasePage{

    @FindBy(xpath = "//h2[text()='Permalinks']")
    WebElement finalText;

    public boolean validateSaveProject() {
        return finalText.isDisplayed();
    }
}
