import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteToFile {
    public static void main(String[] args) {
        // Define the text to write to the file
        String text = "Hello, this is a test message!";

        // Specify the file path (change as needed)
        String filePath = "output.txt";

        // Create an OutputStream to write to the file
        try (OutputStream os = new FileOutputStream(filePath)) {
            // Convert the text to bytes and write to the file
            os.write(text.getBytes());
            System.out.println("Text written to file successfully!");
        } catch (IOException e) {
            // Handle any IO exceptions
            e.printStackTrace();
        }
    }
}
