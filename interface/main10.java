
// Define an interface with a static final variable
interface MyInterface {
    // Static final variable (constant)
    static final String GREETING = "Hello from the Interface!";
}

// Implementing class
class MyClass implements MyInterface {
    public void showMessage() {
        // Accessing the static final variable from the interface
        System.out.println(GREETING);
    }
}

// Main class to run the program
public class main10 {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass obj = new MyClass();

        // Call the method to display the message
        obj.showMessage();
    }
}