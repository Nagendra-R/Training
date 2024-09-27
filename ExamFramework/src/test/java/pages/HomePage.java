package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']/h6")
    WebElement dashboard;

    public boolean validateOnHomePage() {
        return dashboard.isDisplayed();
    }
}
