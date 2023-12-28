package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public static String getProperty(String filePath, String propertyName, String defaultValue) throws IOException {
        try (FileReader fileReader = new FileReader(filePath)) {
            Properties properties = new Properties();
            properties.load(fileReader);
            return properties.getProperty(propertyName, defaultValue);
        }
    }
}
