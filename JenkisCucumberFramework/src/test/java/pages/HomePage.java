package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(id = "jenkins-name-icon")
    WebElement jenkinsIcon;


    @FindBy(xpath = "//a[text()='Dashboard']")
    WebElement dashBoard;


    @FindBy(xpath = "//*[@id='tasks']/div[1]/span/a")
    WebElement newItemButton;


    public boolean validateUserOnHomePage() {
        return dashBoard.getText().equals("Dashboard");
    }


    public void clickOnNewItem() {
        newItemButton.click();
    }
}
