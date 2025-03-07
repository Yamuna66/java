import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main11{
    public static void main(String[] args) {
        // Specify a file name that does not exist
        String fileName = "nonexistent_file.txt";

        // Try to open the file
        try {
            // Create a File object
            File file = new File(fileName);
            // Create a Scanner to read the file
            Scanner fileReader = new Scanner(file);
            // Read the first line (if it exists)
            String firstLine = fileReader.nextLine();
            System.out.println("First line of the file: " + firstLine);
            // Close the Scanner
            fileReader.close();
        } catch (FileNotFoundException e) {
            // Catch the exception and print a message
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }

        // Inform the user that the program has completed
        System.out.println("Program completed.");
    }
}
