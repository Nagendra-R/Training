package pages;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class BasePage {

    WebDriver driver;

    public BasePage(){
        this.driver= DriverManager.getDriver();
        PageFactory.initElements(driver,this);
    }

}
