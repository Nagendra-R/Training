package automation.steps;

import automation.utils.ConfigReader;
import automation.utils.DriverManager;
import automation.utils.ReportManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        System.out.println("Before Scenario");
        ReportManager.initReporter(scenario);
        ConfigReader.initProperties();
        DriverManager.createDriver();
    }



    @After
    public void cleanUP(Scenario scenario){
        if(scenario.isFailed()){
            ReportManager.initReporter(scenario);
        }
        System.out.println("After Scenario");
        DriverManager.getDriver().quit();
    }




}
