package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigPropiertiesHelper {
    private static final String CONFIG_FILE_PATH = "src/test/resources/config.properties";
    private static Properties properties;

    static {
        try {
            properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(CONFIG_FILE_PATH);
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo cargar el archivo de configuración: " + CONFIG_FILE_PATH);
        }
    }

    public static String getPropertyConfig(String key) {
        return properties.getProperty(key);
    }

}



