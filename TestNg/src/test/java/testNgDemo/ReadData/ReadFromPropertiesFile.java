package testNgDemo.ReadData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertiesFile {
    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        prop.load(new FileReader("src/resources/data/Properties.properties"));

        System.out.println(prop.getProperty("login.password"));

    }
}
