package pages;
//package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;



public class BasePage {
    WebDriver driver;

    public BasePage(){
        driver = DriverManager.getDriver();
        PageFactory.initElements(driver,this);
    }

}
