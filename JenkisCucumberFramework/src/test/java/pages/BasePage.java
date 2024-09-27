package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;

public class BasePage {
     WebDriver driver;

    public BasePage(){
        this.driver= DriverManager.getDriver();
        PageFactory.initElements(driver,this);
    }

}
