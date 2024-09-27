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
    }

    @After
    public void clean() {
        DriverManager.getDriver().close();
    }
}
