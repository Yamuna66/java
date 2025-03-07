import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedwriter {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "output.txt";  // Change this to your desired file path

        // Text to be written to the file
        String textToWrite = "Hello, this is a sample text written to the file using BufferedWriter.";

        // Create a BufferedWriter wrapped around FileWriter to write text to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write the text to the file
            writer.write(textToWrite);
            // Optionally, you can write new lines by using write() or newLine()
            writer.newLine();  // Adds a new line in the file
            writer.write("This is another line of text.");
            System.out.println("Text has been written to the file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

