import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedreader {
    public static void main(String[] args) {
        // Specify the path to the text file
        String filePath = "file.txt";  // Replace with your file path

        // Use BufferedReader to read the text file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // Print each line to the console
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}