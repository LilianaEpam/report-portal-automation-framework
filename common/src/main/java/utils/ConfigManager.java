package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Properties;

public final class ConfigManager {

    private static final Logger log = LoggerFactory.getLogger(ConfigManager.class);
    private static final Properties properties = new Properties();

    static {
        loadProperties();
    }

    private ConfigManager() {
        // utility class
    }

    private static void loadProperties() {
        String profile = System.getProperty("profile", "local");
        String fileName = "application-" + profile + ".properties";

        log.info("Loading configuration for profile: {}", profile);

        try (InputStream is = ConfigManager.class
                .getClassLoader()
                .getResourceAsStream(fileName)) {

            if (is == null) {
                throw new RuntimeException("Could not find " + fileName);
            }

            properties.load(is);

        } catch (Exception e) {
            log.error("Failed to load configuration file", e);
            throw new RuntimeException(e);
        }
    }

    public static String get(String key) {
        // Env var tiene prioridad
        String envValue = System.getenv(key.toUpperCase().replace('.', '_'));
        if (envValue != null) {
            return envValue;
        }
        return properties.getProperty(key);
    }
}
