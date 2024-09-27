package Selenium.automation.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class EbayLaptopTitles {
    public static  void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.findElement(By.id("gh-ac")).sendKeys("laptop");
        driver.findElement(By.id("gh-btn")).click();

        WebElement element = driver.findElement(By.xpath(""));

        String originalWindow = driver.getWindowHandle();

        Set<String> listOfWindows =  driver.getWindowHandles();

//        Set<String> listOfWindows = driver.getWindowHandles();?





    }
}
