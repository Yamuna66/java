// Define an interface with a default method
interface MyInterface {
    // Default method with an implementation
    default void showMessage() {
        System.out.println("This is the default method.");
    }
}

// Implement the interface in a class without overriding the default method
class MyClass implements MyInterface {
    // No need to override showMessage() since it has a default implementation
}

// Main class to test the program
public class Main5 {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Create an instance
        obj.showMessage(); // Call the default method
    }
}


