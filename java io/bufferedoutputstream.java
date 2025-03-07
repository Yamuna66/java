import java.io.*;

public class bufferedoutputstream {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "file.txt";  // Change this to your desired file path

        // Text to be written to the file
        String textToWrite = "Hello, this is a sample text written to the file using BufferedOutputStream.";

        // Create a BufferedOutputStream wrapped around FileOutputStream
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            // Convert the string to bytes and write it to the file
            byte[] textBytes = textToWrite.getBytes();  // Convert string to bytes
            bos.write(textBytes); // Write the bytes to the file
            System.out.println("Text has been written to the file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}