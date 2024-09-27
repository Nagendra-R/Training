package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;

    public static void initProperties() throws IOException {
        prop = new Properties();
        prop.load(new FileReader("src/test/resources/config/config.properties"));
    }

    public static String getConfigValue(String key) {
        return prop.getProperty(key);
    }
}
