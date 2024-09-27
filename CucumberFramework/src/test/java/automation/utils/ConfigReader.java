package automation.utils;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.Properties;
//
//public class ConfigReader {
//
//    static Properties prop;
//    public static void initConfig() throws FileNotFoundException {
//        try{
//            prop= new Properties();
////            prop.load(new FileInputStream(""));
//        }catch{
////            return throw new Exception(e);
//        }
//
//    }
//
//}

//[14:46] Abhay Krishnan M N(UST,IN)
//        package com.automation.utils;

import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    public static void initProperties() {
        try {
            prop = new Properties();
            prop.load(new FileReader("src/test/resources/config/config.properties"));
        } catch (Exception e) {

        }
    }

    public static String getConfigValue(String key) {
        return prop.getProperty(key);
    }

//    public static void initConfig() {
//    }
}




