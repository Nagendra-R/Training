package Selenium.automation.java.Selenium.automation;

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

        driver.findElement(By.xpath("//div/div[2]/div/div[2]/div/div/input")).sendKeys("Virat");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div/span")).click();
        driver.findElement(By.xpath("//div[4]/div/div[2]/input")).sendKeys("ABCDEFGHI");
        driver.findElement(By.xpath("//div[1]/div/div[2]/input")).sendKeys("A2936@9360a6288");
        driver.findElement(By.xpath("//div[2]/div/div[2]/input")).sendKeys("A2936@9360a6288");
        driver.findElement(By.xpath("//button[2]")).click();
        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
        driver.findElement(By.xpath("//li[1]/ul/li[4]/a")).click();

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ABCDEFGHI");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("A2936@9360a6288");
        driver.findElement(By.xpath("//button[@type='submit']")).click();




//        Select select = new Select((WebElement) driver);










    }
}
