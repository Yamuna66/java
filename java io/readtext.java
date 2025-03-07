
import java.io.FileReader;
import java.io.IOException;

public class readtext {
    public static void main(String[] args) {
        // Specify the path to the text file
        String filePath = "file.txt"; // Replace with the path of your text file

        // Use FileReader to read the text file
        try (FileReader fileReader = new FileReader(filePath)) {
            int character;

            // Read the file character by character
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character); // Print each character
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}