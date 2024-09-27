package Selenium.automation.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class EbayActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement electronicsLink = driver.findElement(By.xpath("//li/a[text()='Electronics']"));

        //mouseHover
        Actions action = new Actions(driver);
        WebElement appleEle = driver.findElement(By.xpath("//li/a[text()='Apple']"));

//        link on the mousehover and then click on the other element
//        action.moveToElement(electronicsLink).pause(1000).click(appleEle).build().perform();

//        click on the link oopen it into the new Tab
        action.moveToElement(electronicsLink).pause(1000).keyDown(Keys.CONTROL).click(appleEle).keyUp(Keys.CONTROL).build().perform();



    }
}
