// Class with overloaded methods
class MyClass {

    // Method with one parameter
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded method with two parameters
    public void greet(String name, String message) {
        System.out.println("Hello, " + name + "! " + message);
    }
}

// Main class to run the program
public class main1 {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass obj = new MyClass();

        // Call the method with one parameter
        obj.greet("Alice");

        // Call the overloaded method with two parameters
        obj.greet("Bob", "How are you?");
    }
}