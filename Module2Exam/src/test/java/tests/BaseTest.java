package tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.DriverManager;

public class BaseTest {


    @BeforeMethod
    public void setUp() {
        ConfigReader.initProperties();
        DriverManager.createDriver();
    }

    @AfterMethod
    public void close(){
        DriverManager.getDriver().close();
    }
}

