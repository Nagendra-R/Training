package com.automation.steps;

import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Hooks {

    @Before
    public void setUp() throws MalformedURLException {
        DriverManager.createDriver();
        System.out.println("Before Scenario");
    }




    @After
    public void cleanUP(){
        System.out.println("After Scenario");
    }

}
