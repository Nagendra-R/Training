package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DriverManager {

    static WebDriver driver;

    public static void createDriver() throws MalformedURLException {

        if(ConfigReader.getProperty("platform").equals("local")){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        }else{
            ChromeOptions browserOptions = new ChromeOptions();
            browserOptions.setPlatformName("Windows 11");
            browserOptions.setBrowserVersion("latest");
            Map<String, Object> sauceOptions = new HashMap<>();
            sauceOptions.put("username", "oauth-nagrachamallu11-93793");
            sauceOptions.put("accessKey", "*****0755");
            sauceOptions.put("build", "selenium-build-MYJ3J");
            sauceOptions.put("name", "Any Test Name");
            browserOptions.setCapability("sauce:options", sauceOptions);

            URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
            driver = new RemoteWebDriver(url, browserOptions);
        }


    }

    public static WebDriver getDriver(){
        return driver;
    }

}