package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;
import utils.DriverManager;

import java.io.IOException;

public class Hooks {

    @Before
    public void setUp() throws IOException {
        ConfigReader.initProperties();
        DriverManager.createDriver();
        System.out.println("Before Scenario");
    }



    @After
    public void clean(){
        System.out.println("After Scenario");
    }

}
