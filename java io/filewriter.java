import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "output.txt";  // Change this to your desired file path

        // Text to be written to the file
        String textToWrite = "Hello, this is a sample text written to the file using FileWriter.";

        // Create a FileWriter to write text to the file
        try (FileWriter writer = new FileWriter(filePath)) {
            // Write the text to the file
            writer.write(textToWrite);
            System.out.println("Text has been written to the file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
