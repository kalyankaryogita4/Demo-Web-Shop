package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    Properties prop;

    public ConfigReader() {

        try {

            prop = new Properties();

            FileInputStream fis = new FileInputStream("config.properties");

            prop.load(fis);

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public String getURL() {

        return prop.getProperty("url");

    }

}