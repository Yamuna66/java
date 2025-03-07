class OuterClass {
    // Private interface inside the class
    private interface MyInterface {
        // Fields (implicitly public, static, and final)
        String NAME = "Private Interface Example";
        int VALUE = 42;

        // Abstract method
        void showMessage();
    }

    // Implementing class inside OuterClass
    static class MyClass implements MyInterface {
        @Override
        public void showMessage() {
            System.out.println("Hello, this is the private interface method.");
        }
    }

    // Public method to access private interface values
    public static void printInterfaceValues() {
        System.out.println("Name: " + MyInterface.NAME);
        System.out.println("Value: " + MyInterface.VALUE);
    }
}

// Main class
public class main8 {
    public static void main(String[] args) {
        // Access interface fields through the public method
        OuterClass.printInterfaceValues();

        // Create an instance of the implementing class
        OuterClass.MyClass obj = new OuterClass.MyClass();

        // Call the interface method
        obj.showMessage();
    }
}
