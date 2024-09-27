package Selenium.automation.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Expedia {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.findElement(By.xpath("//ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//div/div[1]/div/div/div[2]/div[1]/button")).click();
        driver.findElement(By.xpath("//input[@id=\"origin_select\"]")).sendKeys("Thiruvanthapuram");
        driver.findElement(By.xpath("//div[1]/li/div/div/button")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div[2]/div[1]/button")).click();
        driver.findElement(By.xpath("//input[@id=\"destination_select\"]")).sendKeys("Benguluru");
        driver.findElement(By.xpath("//ul/div[1]/li/div/div/button")).click();
        driver.findElement(By.xpath("//button[@name='EGDSDateRange-date-selector-trigger']")).click();

        driver.findElement(By.xpath("//div/div/div[1]/table/tbody/tr[2]/td[4]/div")).click();
        driver.findElement(By.xpath("//div[1]/table/tbody/tr[2]/td[5]/div/div[2]")).click();
        driver.findElement(By.xpath("//footer/button")).click();




//        driver.findElement(By.xpath("//button[@id='search_button']")).click();
//        List<WebElement> listOfData = driver.findElements(By.xpath("//div[@class='uitk-card uitk-card-roundcorner-all uitk-card-has-border uitk-card-has-primary-theme']/button/span/text()"));
//        for(WebElement ele :listOfData){
//            System.out.println(ele);
//        }






    }
}
