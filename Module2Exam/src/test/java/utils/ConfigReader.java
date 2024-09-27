package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;


    public static void initProperties() {
        prop = new Properties();
        try {
            prop.load(new FileReader("src/test/resources/properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String configValue(String key) {
        return prop.getProperty(key);
    }
}
