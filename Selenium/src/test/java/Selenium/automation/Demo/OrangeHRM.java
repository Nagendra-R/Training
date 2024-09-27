package Selenium.automation.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHRM {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//        Thread.sleep(1000);



        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath(" //li[1]/a/span")).click();
        driver.findElement(By.xpath("//div[2]/div[1]/button")).click();
        driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div")).click();
        driver.findElement(By.xpath("//div[3]/span")).click();
        driver.findElement(By.xpath("//div[3]/div/div[2]/div/div/div[1]")).click();
        driver.findElement(By.xpath("//div[2]/span")).click();
        driver.findElement(By.xpath("//div/div[2]/div/div[2]/div/div/input")).sendKeys("abcedfghi");
        driver.findElement(By.xpath("//div[4]/div/div[2]/input")).sendKeys("ABCDEFGHI");
        driver.findElement(By.xpath("//div[1]/div/div[2]/input")).sendKeys("12345678");
        driver.findElement(By.xpath("//div[2]/div/div[2]/input")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[2]")).click();



//        Select select = new Select((WebElement) driver);










    }
}
