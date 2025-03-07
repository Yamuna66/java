// Superclass
class SuperClass {
    // Default constructor
    public SuperClass() {
        System.out.println("SuperClass default constructor called.");
    }

    // Argument constructor
    public SuperClass(String message) {
        System.out.println("SuperClass constructor with message: " + message);
    }
}

// Subclass
class SuperfromChild extends SuperClass {
    // Default constructor of SuperfromChild class, calling the default constructor of SuperClass
    public SuperfromChild() {
        // Calling the default constructor of the superclass (SuperClass)
        super();  // Calls SuperClass() constructor
        System.out.println("SuperfromChild default constructor called.");
    }

    // Argument constructor of SuperfromChild class, calling the argument constructor of SuperClass
    public SuperfromChild(String message) {
        // Calling the argument constructor of the superclass (SuperClass)
        super(message);  // Calls SuperClass(String message) constructor
        System.out.println("SuperfromChild constructor with message: " + message);
    }
}

public class Child {
    public static void main(String[] args) {
        // Only creating the object of SuperfromChild with the argument constructor
        new SuperfromChild("Hello from the child!"); // No need to store this in a variable
    }
}
