package com.automation.runner;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRunner {


    @Test
    void testAnother() {
        Karate.run("classpath:features").outputCucumberJson(true);
    }





}
