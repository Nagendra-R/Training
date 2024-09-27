package Selenium.automation.java.Selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//import static jdk.internal.org.jline.utils.Colors.s;

public class CheckInAndOutDate {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));



        String checkInDate ="18 October 2024";
        String checkoutDate = "8 November 2024";
        driver.findElement(By.xpath("//button[contains(@name,'date-selector-trigger')]")).click();
        checkDates(checkInDate,driver);
        checkDates(checkoutDate,driver);

        driver.findElement(By.xpath("//button[contains(@data-stid,'apply-date-selector')]")).click();


    }

    public static void checkDates(String date,WebDriver driver) throws InterruptedException {

        String xPathDay = "//div[contains(@class,'uitk-month-double-left')]//div[contains(@class,'uitk-date-number-') and text()='%s']";



        String monthYear = date.substring(date.indexOf(' ')+1);
        String  day  = date.substring(0,date.indexOf(' '));

        WebElement monthDate = driver.findElement(By.xpath("//div[contains(@class,'uitk-month-double-left')]//span[contains(@class,'uitk-month-label')]"));

        while(!monthDate.getText().equals(monthYear)){
            driver.findElement(By.xpath("//button[contains(@data-stid,'controls-next-button')]")).click();
            monthDate = driver.findElement(By.xpath("//div[contains(@class,'uitk-month-double-left')]//span[contains(@class,'uitk-month-label')]"));
            Thread.sleep(1000);
        }

        String dayXpath = String.format(xPathDay,day);
//        System.out.println(xPathDay);
        driver.findElement(By.xpath(dayXpath)).click();







    }

}
