package com.automation.pages;

import com.automation.utils.DriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    AppiumDriver driver;
    BasePage(){
//        driver = new AndroidDriver();
        PageFactory.initElements(driver,this);
    }
}
