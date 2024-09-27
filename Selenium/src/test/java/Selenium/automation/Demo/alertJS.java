package Selenium.automation.Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class alertJS {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement jsAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        jsAlert.click();

        Alert alert = driver.switchTo().alert();
        //getmesage
        System.out.println(alert.getText());
        alert.accept();

        WebElement secondButton = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//        Actions action = new Actions(driver);
        secondButton.click();
//        action.pause(1000);
        alert.accept();




//thirdButton

        WebElement thirdButton = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        thirdButton.click();
        alert.sendKeys("Third Button is Clicked");
        alert.accept();

        //get






    }
}
