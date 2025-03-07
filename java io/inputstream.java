import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputstream {
    public static void main(String[] args) {
        // Specify the path to the text file
        String filePath = "example.txt";  // Replace with your file path

        // Use FileInputStream and InputStreamReader to read the file
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);  // Print each line of the file
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
