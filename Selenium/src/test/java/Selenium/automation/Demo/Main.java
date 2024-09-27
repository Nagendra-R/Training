package Selenium.automation.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(999);

//        printing the list of values from dropdown
        List<WebElement> listOfElements=driver.findElements(By.id("gh-cat"));
        for(WebElement element : listOfElements){
            System.out.println(element.getText());
        }

        //another way of printing the dropdown values
//        Select dropDownCat =  new Select(driver.findElement(By.id("gh-cat")));
//        List<WebElement> list  = dropDownCat.getOptions();
//        for(WebElement element:list){
//            System.out.println(element.getText());
//        }

        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Laptop");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        Select dropDown = new Select(driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")));
        dropDown.selectByVisibleText("Music");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"gh-as-a\"]")).click();
        Thread.sleep(999);
        if(!driver.findElement(By.name("LH_TitleDesc")).isSelected()){
            driver.findElement(By.name("LH_TitleDesc")).click();
        }
        Thread.sleep(1999);

        if(!driver.findElement(By.name("LH_Complete")).isSelected()){
            driver.findElement(By.name("LH_Complete")).click();
        }
        Thread.sleep(1999);

        if(!driver.findElement(By.name("LH_Sold")).isSelected()){
            driver.findElement(By.name("LH_Sold")).click();
        }





        Thread.sleep(1000);
//        driver.close();


    }
}
