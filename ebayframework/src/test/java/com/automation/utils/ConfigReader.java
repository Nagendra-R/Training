package com.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    public static void initConfig() {
        prop = new Properties();
        try {
            prop.load(new FileInputStream("src/test/resources/config/config.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getConfigValue(String key) {
        return prop.getProperty(key);
    }

}