package Selenium.automation.java.Selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        fileUpload.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\screenshot\\img1.png");

    }
}
