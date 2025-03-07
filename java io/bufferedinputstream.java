import java.io.*;

public class bufferedinputstream {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "file.txt";  

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            int character;

            // Read the file byte by byte and print it as characters
            while ((character = bis.read()) != -1) {
                System.out.print((char) character); // Cast byte to char and print
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

 
