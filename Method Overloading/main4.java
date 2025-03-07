public class main4 {

    // Method that takes an integer
    public void display(int number) {
        System.out.println("Displaying integer: " + number);
    }

    // Method that takes a String
    public void display(String text) {
        System.out.println("Displaying string: " + text);
    }

    public static void main(String[] args) {
        main4 example = new main4();

        // Call the method with an integer
        example.display(5); // Output: Displaying integer: 5

        // Call the method with a String
        example.display("Hello, World!"); // Output: Displaying string: Hello, World!
    }
}

