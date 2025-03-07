// Superclass with a method
class SuperClass {

    // Method in the superclass
    public void display(String message) {
        System.out.println("SuperClass Message: " + message);
    }
}

// Subclass with a method having the same name
class SubClass extends SuperClass {

    // Overriding method in the subclass
    @Override
    public void display(String message) {
        System.out.println("SubClass Message: " + message);
    }
}

// Main class to run the program
public class main3 {
    public static void main(String[] args) {
        // Create an instance of SuperClass
        SuperClass superObj = new SuperClass();
        superObj.display("Hello from SuperClass!");

        // Create an instance of SubClass
        SubClass subObj = new SubClass();
        subObj.display("Hello from SubClass!");
    }
}

