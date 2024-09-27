package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.Random;

public class ProjectPage extends BasePage{
    @FindBy(className = "h3")
    WebElement validateItemText;

    @FindBy(id="name")
    WebElement itemName;

    @FindBy(xpath = "//li[@class='hudson_model_FreeStyleProject']")
    WebElement clickOnFreestyle;

    @FindBy(id = "ok-button")
    WebElement okButton;




    public void validateProjectPage() {
        validateItemText.isDisplayed();
    }

    public void inputItemNameAndClickFreeStyleProjectAndOkButton() {
        itemName.sendKeys(randomString());
        clickOnFreestyle.click();
        okButton.click();
    }

    public static String randomString() {
        String str = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder s = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomIndex = random.nextInt(str.length());
            s.append(str.charAt(randomIndex));
        }
        return s.toString();
    }


}
