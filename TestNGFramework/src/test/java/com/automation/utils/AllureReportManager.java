package com.automation.utils;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class AllureReportManager {

//    @Attachment(type = "image/png",value = "screenshot")
//    public static byte[] attachScreenshot(){
//        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
//        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//        return screenshot;
//    }

    @Attachment(type = "text/plain")
    public static String attachLog(String message){
        return message;
    }

    public static void attachScreenshot(){
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment("screenshot", new ByteArrayInputStream(screenshot));
    }



}
