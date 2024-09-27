package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;
import utils.DriverManager;


public class Hooks {
    @Before
    public void setUp(){
        ConfigReader.initProperties();
        DriverManager.createDriver();
    }

    @After
    public void close(){
//        DriverManager.getDriver().quit();
    }

}
