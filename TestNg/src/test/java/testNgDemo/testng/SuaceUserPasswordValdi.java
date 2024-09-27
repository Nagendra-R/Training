package testNgDemo.testng;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
public class SuaceUserPasswordValdi {

    WebDriver driver;
    @Test(dataProvider = "dp")
    public void positiveTest(String name) throws InterruptedException {

        driver.findElement(By.id("user-name")).sendKeys(name);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        String s=driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
        assertEquals("Swag Labs",s);
        Thread.sleep(2000);
        driver.navigate().back();


    }
    @Test(dataProvider = "neg")
    public void negativeTest(String name) throws InterruptedException {

        driver.findElement(By.id("user-name")).sendKeys(name);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
        driver.navigate().refresh();
        Thread.sleep(2000);

    }
    @DataProvider
    public Object[] dp() {
        Object[] data= {"standard_user","problem_user","performance_glitch_user","error_user","visual_user"};
        return data;

    }
    @DataProvider
    public Object[] neg() {
        Object[] d={"locked_out_user"};
        return d;

    }
    @BeforeTest
    public void beforeMethod() {
        driver =new ChromeDriver();

        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
    @AfterTest
    public void afterMethod() {

        driver.close();
    }
}