package Selenium.automation.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TheInternetHeroKuapp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/tables");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().window().maximize();
        Thread.sleep(999);

        //implicit wait after the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


//        List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[not(a)]"));
//
//        for(int i=0;i<tableData.size();i++){
//            System.out.print(tableData.get(i).getText() +"   ");
//            if((i+1)%5 ==0){
//                System.out.println();
//            }
//        }

//        List<WebElement> tableLastLine = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[4]/td[not(a)]"));
////        System.out.println(tableLastLine.size()-1);
//        System.out.println(tableLastLine.getLast().getText());


        //sleep of sometime
        WebElement textEle = driver.findElement(By.xpath("//button"));
        textEle.click();
//        Thread.sleep(5000);

//        explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(textEle));


        System.out.println(textEle.getText());



    }
}
