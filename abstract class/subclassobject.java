// Abstract class  
abstract class Animal {  
    // Abstract method (to be implemented by subclasses)  
    public abstract void makeSound();  

    // Non-abstract method (common behavior for all animals)  
    public void eat() {  
        System.out.println("Animal is eating.");  
    }  
}  

// Subclass (concrete class) inheriting from Animal  
class Dog extends Animal {  
    // Implementing the abstract method from the Animal class  
    @Override  
    public void makeSound() {  
        System.out.println("Woof!");  
    }  
}  

public class subclassobject {  
    public static void main(String[] args) {  
        // Creating an object of the subclass (Dog)  
        Dog myDog = new Dog();  

        // Calling the non-abstract method (inherited from the abstract class)  
        myDog.eat();  // Output: Animal is eating.  

        // Calling the abstract method (implemented in the subclass)  
        myDog.makeSound(); // Output: Woof!  
    }  
}  
