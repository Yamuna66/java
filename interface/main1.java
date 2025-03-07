// Step 1: Define the interface
interface Animal {
    void makeSound();
}

// Step 2: Implement the interface in a class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Another class implementing the same interface.
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

// Step 3: Use the interface instances in the main method
public class main1 {
    public static void main(String[] args) {
        // Create instances of Dog and Cat using the Animal interface
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call the makeSound method for each animal
        myDog.makeSound(); // Output: Woof! Woof!
        myCat.makeSound(); // Output: Meow! Meow!
    }
}