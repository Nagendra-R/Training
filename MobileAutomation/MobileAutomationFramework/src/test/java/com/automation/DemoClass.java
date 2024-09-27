package com.automation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoClass {
    public static void main(String[] args) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", "C:\\Users\\280751\\Downloads\\expedia.apk");  // The filename of the mobile app
        caps.setCapability("appium:deviceName", "emulator-5556");
        //caps.setCapability("appium:platformVersion", "12.0");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appWaitForLaunch" , "false");

//        caps.setCapability("appPackage","com.swaglabsmobileapp");
//        caps.setCapability("appActivity","com.swaglabsmobileapp.MainActivity");


        caps.setCapability("appActivity","com.expedia.bookings.activity.SearchActivity");
        caps.setCapability("appPackage","com.expedia.bookings");

//        DesiredCapabilities sauceOptions = new DesiredCapabilities();
//        sauceOptions.setCapability("username", "oauth-nagrachamallu11-93793");
//        sauceOptions.setCapability("accessKey", "57eab063-37fb-4108-9b08-24d027780755");
//        sauceOptions.setCapability("build", "appium-build-RQVDC");
//        sauceOptions.setCapability("name", "<your test name>");
//        sauceOptions.setCapability("deviceOrientation", "PORTRAIT");
//        caps.setCapability("sauce:options", sauceOptions);

        // Start the session
        URL url = new URL("http://127.0.0.1:4723");
        AppiumDriver driver = new AndroidDriver(url, caps);

// replace with commands and assertions
//        Thread.sleep(5000);
//        String jobStatus = "passed"; // or "failed"
//
//// end the session
//        driver.executeScript("sauce:job-result=" + jobStatus);
//        driver.quit();
    }

}
