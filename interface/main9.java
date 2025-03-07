interface Animal {
    // Public static final fields (constants)
    String TYPE = "Mammal";      // Public constant
    int LEGS = 4;                // Public constant

    // Method signatures
    void makeSound();
}

// Step 2: Implement the interface in a class
class Dog implements Animal {
    // Private field specific to Dog class
    final  String name;

    // Constructor
    public Dog(String name) {
        this.name = name;
    }

    // Implementing the makeSound method from Animal interface
    @Override
    public void makeSound() {
        System.out.println(name + " says Woof!");
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Animal Type: " + TYPE);
        System.out.println("Number of Legs: " + LEGS);
        System.out.println("Dog Name: " + name);
    }
}

// Step 3: Use the class in the main method
public class main9 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy"); // Create an instance of Dog
        myDog.makeSound();             // Call the makeSound method
        myDog.displayDetails();        // Display dog details
    }
}

