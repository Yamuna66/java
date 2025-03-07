import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) {
        // Create a Properties object
        Properties properties = new Properties();

        // Load the properties file
        try (FileInputStream input = new FileInputStream("config.properties")) {
            // Load the properties from the file
            properties.load(input);

            // Read values using keys
            String dbUrl = properties.getProperty("db.url");
            String dbUsername = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");

            // Display the read values
            System.out.println("Database URL: " + dbUrl);
            System.out.println("Database Username: " + dbUsername);
            System.out.println("Database Password: " + dbPassword);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

 