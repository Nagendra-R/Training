package testNgDemo.testng;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
public class SaucedemoTest {
    WebDriver driver;
    @Test
    public void sauceTest() throws InterruptedException {

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
        driver.findElement(By.xpath("//div[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(3000);
        String str1=driver.findElement(By.xpath("//a[@id=\"item_1_title_link\"]/div")).getText();
        Thread.sleep(3000);
        String str2=driver.findElement(By.xpath("//div[@data-test='inventory-item-desc']")).getText();
        Thread.sleep(3000);
        String str3=driver.findElement(By.xpath("//div[@data-test='inventory-item-price']")).getText();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        driver.findElement(By.id("checkout")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("first-name")).sendKeys("ronaldo");
        Thread.sleep(3000);
        driver.findElement(By.id("last-name")).sendKeys("nazario");
        Thread.sleep(3000);
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        List<WebElement> li= driver.findElements(By.xpath("//div[@class='cart_item_label']"));
        for(WebElement i:li) {
            System.out.println(i.findElement(By.xpath("./div")).getText());
        }

        List<WebElement> shipp = driver.findElements(By.xpath("//div[@class='summary_info']/div[not(button)]"));
        for(WebElement j:shipp) {
            System.out.println(j.getText());
        }

        driver.findElement(By.id("finish")).click();


        System.out.println( driver.findElement(By.tagName("h2")).getText());
        System.out.print(driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/div")).getText());


    }
    @BeforeClass
    public void beforeClass() {
        driver =new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

    }
    @AfterClass
    public void afterClass() {
    }
}