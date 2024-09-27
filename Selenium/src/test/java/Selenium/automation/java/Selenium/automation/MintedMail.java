package Selenium.automation.java.Selenium.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MintedMail {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.minted.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    }
}
