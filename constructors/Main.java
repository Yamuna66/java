// Class with different constructors
class DefaultConstructor {
    // Default constructor
    public DefaultConstructor() {
        System.out.println("This is the default constructor.");
    }

    // Constructor with one argument
    public DefaultConstructor(String message) {
        System.out.println("This is the one-argument constructor. Message: " + message);
    }

    // Constructor with two arguments
    public DefaultConstructor(String message, int number) {
        System.out.println("This is the two-argument constructor. Message: " + message + ", Number: " + number);
    }
}

// Main class to call all constructors without using obj
public class Main {
    public static void main(String[] args) {
        // Calling the default constructor directly
        new DefaultConstructor();  // Calls the default constructor

        // Calling the one-argument constructor directly
        new DefaultConstructor("Hello, World!");  // Calls the one-argument constructor

        // Calling the two-argument constructor directly
        new DefaultConstructor("Java", 2025);  // Calls the two-argument constructor
    }
}
