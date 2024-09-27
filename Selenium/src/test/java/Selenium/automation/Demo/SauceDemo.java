package Selenium.automation.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SauceDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/inventory.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();Thread.sleep(500);
        driver.findElement(By.xpath("//button[@id='checkout']")).click();Thread.sleep(500);
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Nagendra");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Reddy");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("123456");Thread.sleep(500);

        driver.findElement(By.xpath("//input[@id='continue']")).click();Thread.sleep(500);
        driver.findElement(By.xpath("//button[@id='finish']")).click();Thread.sleep(500);
        String result = driver.findElement(By.xpath("//div[@id='checkout_complete_container']/div")).getText();
        System.out.println(result);





    }
}
